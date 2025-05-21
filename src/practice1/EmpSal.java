package practice1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EmpSal {

	public static void main(String[] args) {
		 
        List<Integer> salaries = Arrays.asList(25000, 18000, 32000, 28000, 32000);
        Optional<Integer> secondHighest = salaries.stream()
                                        .distinct()                             // Remove duplicates
                                        .sorted(Comparator.reverseOrder())      // Descending order
                                        .skip(1)                                 // Skip highest
                                        .findFirst();                            // Get second highest

       secondHighest.ifPresent(sal -> 
        System.out.println("Second highest salary: " + sal));
	}
}
