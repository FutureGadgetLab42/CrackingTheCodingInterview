package chapter_1.one_away;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings, s1 and s2, determine if one can be transformed in to another
 * using one edit. An edit is defined as one of the following operations:
 *  1) insert a character
 *  2) delete a character
 *  3) replace a character with a different character
 * */
public class OneAway {

    public boolean oneAway(String s1, String s2) {
        if(Math.abs(s1.length() - s2.length()) > 1) return false;

        Map<Character, Integer> occurrences = new HashMap<>();
        char s1Chars[] = s1.toCharArray(), s2Chars[] = s2.toCharArray();

        for(int i = 0; i < Math.max(s1Chars.length, s2Chars.length); i++) {
            if(i < s1Chars.length) {
                if(occurrences.containsKey(s1Chars[i])) occurrences.put(s1Chars[i], 1 + occurrences.get(s1Chars[i]));
                else occurrences.put(s1Chars[i], 1);
            }

            if(i < s2Chars.length) {
                if(occurrences.containsKey(s2Chars[i])) occurrences.put(s2Chars[i], occurrences.get(s2Chars[i]) - 1);
                else occurrences.put(s2Chars[i], -1);
            }
        }

        int valueSum = occurrences.values().stream().reduce(0, (a, b) -> Math.abs(a) + Math.abs(b));
        return valueSum <= 2;
    }

}
