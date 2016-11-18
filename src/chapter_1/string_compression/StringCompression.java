package chapter_1.string_compression;

/**
 * Given a String, s, compress s according to the following schema:
 *  Let c be an arbitrary character. Then if s contains n consecutive
 *  occurrences of c as a substring, replace that substring with "cn"
 * */
public class StringCompression {

    public String stringCompression(String s) {
        StringBuilder result = new StringBuilder();
        char chars[] = s.toCharArray(), lastChar;

        for(int i = 0; i < chars.length; i++) {
            lastChar = chars[i];
            int j = i;
            while(j < chars.length && chars[j] == lastChar) {
                j++;
            }
            result.append(lastChar + "" + (j - i));
            i = j - 1;
        }

        return result.toString();
    }

}
