//Singleton
public class Singleton {

// create a single private static instance
	private static Singleton singleton = new Singleton();

// create private constructor
// It prevents anyone from using new Singleton() outside this class
	private Singleton() {
	}

// This method gives controlled access to the single instance
// ItÅfs static, so it can be called without creating an object
	public static Singleton getInstance() {
		return singleton;
	}

// simple method inside the class
	void method() {
		System.out.println("method singleton");
	}
}
