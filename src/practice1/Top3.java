package practice1;

import java.util.*;
import java.util.stream.Collectors;

public class Top3 {
	public static void main(String[] args) {
		List<Integer> views = Arrays.asList(1, 2, 3, 2, 4, 4, 5, 5,3, 6, 1, 2);
		
		
		Set <Integer> topUnique = views.stream()//.distinct()
								.sorted(Comparator.reverseOrder())
								.limit(3).collect(Collectors.toSet());
		
		List <Integer> result = views.stream().sorted(Comparator.reverseOrder())
								.filter(topUnique::contains)
								.collect(Collectors.toList());
		
//		List<Integer> top  = views.stream().sorted((a,b) -> b.compareTo(a)).collect(Collectors.toList());
//		
//		List <Integer> result = new ArrayList<>();
//		Set <Integer> unique = new LinkedHashSet<>();
//		for( int num : top) {
//			result.add(num);
//			unique.add(num);
//			if (unique.size()==4)
//				break;
//		}
			System.out.println(result);
//			System.out.println(top);
	}

}
