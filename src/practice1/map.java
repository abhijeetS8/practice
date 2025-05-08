package practice1;
import java.util.HashMap;

public class map {
	public static void main(String[] args) {

		HashMap<Integer, String> hm1 = new HashMap<>(1);
		HashMap<Integer, String> hm2 = new HashMap<>(1);
		
		hm1.put(1, "one");
        hm1.put(2, "two");
        hm1.put(3, "three");
        
        hm2.put(4, "four");
        hm2.put(5, "five");
        hm2.put(6, "six");
        
        System.out.println(hm1);
        System.out.println(hm2);
  
	}
}
