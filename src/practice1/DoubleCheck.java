package practice1;

public class DoubleCheck {
	
	private static DoubleCheck instance;
	
	private DoubleCheck() {}
	
	//DoubleCheck
	public static DoubleCheck getinstance() {
		if(instance==null) {
			synchronized (DoubleCheck.class) {
				if(instance==null) {
					instance = new DoubleCheck();
				}
			}
		}
		return instance;
	}

}
