package chapter_1.palindrome_permutation;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a String, s, determine if s is a permutation of a palindrome.
 * */
public class PalindromePermutation {

    boolean palindromePermutation(String s) {
        Map<Character, Integer> occurrences = new HashMap<>();
        char chars[] = s.toCharArray();

        for(int i = 0; i < chars.length; i++) {
            if(occurrences.containsKey(chars[i])) occurrences.put(chars[i], 1 + occurrences.get(chars[i]));
            else occurrences.put(chars[i], 1);
        }

        return occurrences.values().stream().filter(n -> n % 2 == 1).count() <= 1;
    }

}
