package chapter_1.is_unique;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a String, s, determine if each character of s occurs no more than once.
 * */
public class IsUnique {

    public boolean isUnique(String s) {
        Map<Character, Integer> occurrences = new HashMap<>();
        char[] chars = s.toCharArray();

        for(int i = 0; i < chars.length; i++) {
            if(occurrences.containsKey(chars[i])) occurrences.put(chars[i], 1 + occurrences.get(chars[i]));
            else occurrences.put(chars[i], 1);
        }

        return occurrences.values().stream().allMatch(n -> n == 1);
    }

}
