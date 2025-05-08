package practice1;
import java.util.*;
import java.util.stream.Collectors;

public class FrequencyCounterStream {
    public static void main(String[] args) {
        List<Integer> views = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 1, 2);

        Map<Integer, Long> frequencyMap = views.stream()
        			.collect(Collectors.groupingBy(view -> view,Collectors.counting()));

        System.out.println(frequencyMap);
        
    }
}
