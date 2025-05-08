package practice1;

import java.util.Map;
import java.util.stream.Collectors;

public class Frequency {
	public static void main(String[] args) {
		String word = "bananaahhaho";
		Map<Character, Long> frequency = word.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(view -> view, Collectors.counting()));

		System.out.println(frequency);

		System.out.println("repeated:");

		frequency.entrySet().stream().filter(c -> c.getValue() > 1)
				.forEach(c -> System.out.println(c.getKey() + "->" + c.getValue()));

	}
}
