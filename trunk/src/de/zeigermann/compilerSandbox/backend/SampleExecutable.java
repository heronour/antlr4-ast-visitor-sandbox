package de.zeigermann.compilerSandbox.backend;

// The purpose of this class is solely to generate bytecode and then ASM-code using ByteCodeOutline.
public class SampleExecutable extends Executable {

	@Override
	public int execute() {
		return 500000;
	}

	// there always is a constructor, even when you do not defined it - JVM
	// needs it
	public SampleExecutable() {

	}

	// these method's bytecode shows us how to multiply integers

	public int plus(int a, int b) {
		return a + b;
	}

	public int minus(int a, int b) {
		return a - b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	// this method's bytecode shows us to to put constants on top of the stack

	public int constants() {
		int a = 50000;
		int b = 100000;
		return a * b;
	}

	// just to see the bytecode for this execute method
}
