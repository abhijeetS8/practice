//Double Check Sigleton-- thread safety

public class SingletonTest {
	private static SingletonTest instance;
	
	 private SingletonTest() {}
	 
	 public static SingletonTest getInstance() {
		 if (instance == null) {
			 synchronized (SingletonTest.class) {
				if (instance== null) {
					instance= new SingletonTest();
				}
			}
		 }
		return instance;
	 }
	 
	 public static void main(String[] args) {
		SingletonTest obj1 = SingletonTest.getInstance();
		SingletonTest obj2 = SingletonTest.getInstance();		
		System.out.println(obj1==obj2);
	}
}
