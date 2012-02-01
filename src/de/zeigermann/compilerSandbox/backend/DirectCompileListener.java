package de.zeigermann.compilerSandbox.backend;

import static org.objectweb.asm.Opcodes.ACC_PUBLIC;
import static org.objectweb.asm.Opcodes.ACC_SUPER;
import static org.objectweb.asm.Opcodes.ALOAD;
import static org.objectweb.asm.Opcodes.IADD;
import static org.objectweb.asm.Opcodes.IDIV;
import static org.objectweb.asm.Opcodes.IMUL;
import static org.objectweb.asm.Opcodes.INVOKESPECIAL;
import static org.objectweb.asm.Opcodes.IRETURN;
import static org.objectweb.asm.Opcodes.ISUB;
import static org.objectweb.asm.Opcodes.RETURN;
import static org.objectweb.asm.Opcodes.V1_6;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;

import de.zeigermann.compilerSandbox.parser.v4.BlankExprV4Listener;
import de.zeigermann.compilerSandbox.parser.v4.ExprV4Parser.atomContext;
import de.zeigermann.compilerSandbox.parser.v4.ExprV4Parser.opExprContext;
import de.zeigermann.compilerSandbox.parser.v4.ExprV4Parser.startContext;


public class DirectCompileListener extends BlankExprV4Listener {

	private final static int THIS = 0;

	private transient Executable executable;
	
	protected transient ClassWriter cw;
	protected transient MethodVisitor mv;
	private final String superClassName = "de/zeigermann/compilerSandbox/backend/Executable";
	// XXX this is the same name over and over again - if we needed more
	// than one compiled expression at a time, we would have to specify a
	// unique name for each
	private final String className = "ExpressionExecutable";

	private void createCtor() {
		// ctor no args
		// public ExpressionExecutable()
		MethodVisitor mv = cw.visitMethod(ACC_PUBLIC, "<init>",
				"()V", null, null);
		mv.visitCode();
		mv.visitVarInsn(ALOAD, THIS);
		mv.visitMethodInsn(INVOKESPECIAL, superClassName, "<init>", "()V");
		mv.visitInsn(RETURN);

		// we can pass whatever we like as we have set
		// ClassWriter.COMPUTE_FRAMES to ClassWriter
		mv.visitMaxs(1, 1);
		mv.visitEnd();

	}

	public Executable getExecutable() {
		return executable;
	}

	@Override
	public void enterRule(startContext ctx) {
		// init
		cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);

		// creating the class
		cw.visit(V1_6, ACC_PUBLIC + ACC_SUPER, className, null,
				superClassName, null);

		// creating the constructor
		createCtor();

		// creating the execute method
		mv = cw.visitMethod(ACC_PUBLIC, "execute", "()I", null, null);
		mv.visitCode();

	}
	@Override
	public void exitRule(startContext ctx) {
		// finish
		mv.visitInsn(IRETURN);
		mv.visitMaxs(1, 1);
		mv.visitEnd();
		cw.visitEnd();

		// load executable
		Loader loader = new Loader();
		byte[] byteArray = cw.toByteArray();
		executable = loader.load(byteArray);
	}

	@Override
	public void exitRule(atomContext ctx) {
		int value = Integer.parseInt(ctx.i.getText());
		// this means: put a constant value on the JVM operand stack
		mv.visitLdcInsn(value);
	}

	@Override
	public void exitRule(opExprContext ctx) {
		String operator = ctx.op.getText();
		if (operator.equals("+")) {
			mv.visitInsn(IADD);
		} else 
		if (operator.equals("-")) {
			mv.visitInsn(ISUB);
		} else
		if (operator.equals("*")) {
			mv.visitInsn(IMUL);
		} else 
		if (operator.equals("/")) {
			mv.visitInsn(IDIV);
		} else {
			throw new IllegalArgumentException("Unknown operator "
					+ operator);
		}
	}
	
}
