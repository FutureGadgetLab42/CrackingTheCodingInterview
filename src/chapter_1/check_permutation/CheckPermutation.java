package chapter_1.check_permutation;


import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings, s1 and s2, determine if they are permutations of each other.
 * */
public class CheckPermutation {

    public boolean checkPermutation(String s1, String s2) {
        if(s1.length() != s2.length()) return false;

        char[] arr1 = s1.toCharArray(), arr2 = s2.toCharArray();
        Map<Character, Integer> occurrences = new HashMap<>();
        for(int i = 0; i < arr1.length; i++) {
            if(occurrences.containsKey(arr1[i])) occurrences.put(arr1[i], 1 + occurrences.get(arr1[i]));
            else occurrences.put(arr1[i], 1);

            if(occurrences.containsKey(arr2[i])) occurrences.put(arr2[i], occurrences.get(arr2[i]) - 1);
            else occurrences.put(arr2[i], -1);
        }

        return occurrences.values().stream().allMatch(n -> n == 0);
    }
}
