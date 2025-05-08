package practice1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequency {
	public static void main(String[] args) {

		List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
		Map<String, Long> frequency = words.stream()
				.collect(Collectors.groupingBy(word -> word, Collectors.counting()));

		System.out.println(frequency);

		String secondhighest = frequency.entrySet().stream()
				.sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder())).skip(1).findFirst()
				.map(Map.Entry::getKey).orElse(null);
		System.out.println(secondhighest);

	}
}
