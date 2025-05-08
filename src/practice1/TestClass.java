package practice1;

public class TestClass {

	public static class A {
		interface MyInterface {
			void show();
		}
	}

	public static class B {
		interface MyInterface {
			void display();
		}
	}

	public void callInterfaces(A.MyInterface obj1, B.MyInterface obj2) {
		obj1.show();
		obj2.display();
	}

	public static void main(String[] args) {

		A.MyInterface obj1 = new A.MyInterface() {
			@Override
			public void show() {
				System.out.println("A.MyInterface show method");
			}
		};

		B.MyInterface obj2 = new B.MyInterface() {
			@Override
			public void display() {
				System.out.println("B.MyInterface display method");
			}
		};

		TestClass test = new TestClass();
		test.callInterfaces(obj1, obj2);
	}

}
