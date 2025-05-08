package practice1;

public class reverseNum {
	public static void main(String[] args) {
		
		int num = 12345;
		
		StringBuilder sb = new StringBuilder(String.valueOf(num));
		String reverse = sb.reverse().toString();
		
		System.out.println("Reversed Num " + reverse);
		
	}
}
