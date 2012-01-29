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

import de.zeigermann.compilerSandbox.ast.Expression;
import de.zeigermann.compilerSandbox.ast.Number;
import de.zeigermann.compilerSandbox.ast.Operation;
import de.zeigermann.compilerSandbox.ast.Operation.Operator;
import de.zeigermann.compilerSandbox.visitor.Visitor;


public class CompilerVisitor implements Visitor {

	private final static int THIS = 0;

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

	public Executable compile(Expression expression) {
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

		// create bytecode for execute method by walking the expression
		// notice that we do not need a stack in this code, as the generated
		// bytecodes work on the JVM operand stack
		expression.accept(this);

		// finish
		mv.visitInsn(IRETURN);
		mv.visitMaxs(1, 1);
		mv.visitEnd();
		cw.visitEnd();

		// load and return
		Loader loader = new Loader();
		byte[] byteArray = cw.toByteArray();
		Executable executeable = loader.load(byteArray);
		return executeable;
	}

	@Override
	public void visit(Number number) {
		// this means: put a constant value on the JVM operand stack
		mv.visitLdcInsn(number.getValue());
	}

	@Override
	public void visit(Operation operation) {
		operation.visitChildren(this);
		Operator currentOperator = operation.getOperator();
		switch (currentOperator) {
		case PLUS:
			mv.visitInsn(IADD);
			break;
		case MINUS:
			mv.visitInsn(ISUB);
			break;
		case MULTIPLY:
			mv.visitInsn(IMUL);
			break;
		case DIVIDE:
			mv.visitInsn(IDIV);
			break;
		default:
			throw new IllegalArgumentException("Unknown operator "
					+ currentOperator);
		}
	}

}
