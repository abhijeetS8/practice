package practice1;
import java.util.*;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "abhijeet";
        String str2 = "bahijeet";

        boolean result = areAnagrams(str1, str2);
        System.out.println("Are the strings anagrams? " + result);
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        // Count characters in str1
        for (char ch : str1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Subtract counts using str2
        for (char ch : str2.toCharArray()) {
            if (!map.containsKey(ch)) return false;
            map.put(ch, map.get(ch) - 1);
            if (map.get(ch) < 0) return false;
        }

        return true;
    }
}
