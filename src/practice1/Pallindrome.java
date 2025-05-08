package practice1;
import java.util.stream.IntStream;

public class Pallindrome {
	public static void main(String[] args) {
		//String input = "madam";
		
		int number = 12321;
		String input = String.valueOf(number);
		
		boolean isPalindrome = IntStream.range(0, input.length()/2)
				.allMatch(i -> input.charAt(i)== input.charAt(input.length()-i-1));
		
		System.out.println(input + " is palindrome? " + isPalindrome);
	}
}
