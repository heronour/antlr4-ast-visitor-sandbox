package backend;

public class Loader {

	@SuppressWarnings("unchecked")
	protected <T> Class<T> loadClass(byte[] b, Class<T> type) {
		return cloadLoader.defineClass(null, b);
	}

	protected Class<?> loadClass(byte[] b) {
		return cloadLoader.defineClass(null, b);
	}

	@SuppressWarnings("rawtypes")
	private static class DelegatingClassLoader extends ClassLoader {
		private final ClassLoader parentClassLoader;

		public DelegatingClassLoader(ClassLoader parentClassLoader) {
			this.parentClassLoader = parentClassLoader;
		}

		public Class defineClass(String name, byte[] b) {
			return defineClass(name, b, 0, b.length);
		}

		@Override
		public Class<?> loadClass(String name) throws ClassNotFoundException {
			return parentClassLoader.loadClass(name);
		}
	};

	// all the compiled classes live as long as this class loader lives
	// this class loader lives as long as this compiler
	private final DelegatingClassLoader cloadLoader = new DelegatingClassLoader(
			Loader.class.getClassLoader());

	public Executable load(byte[] byteArray) {
		Class<Executable> myClass = loadClass(byteArray, Executable.class);
		try {
			Executable executable = myClass.newInstance();
			return executable;
		} catch (InstantiationException e) {
			throw new RuntimeException("Internal error " + e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException("Internal error " + e);
		}

	}

}
