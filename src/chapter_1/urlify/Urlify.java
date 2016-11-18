package chapter_1.urlify;

/**
 * Given a string, s, replace all spaces in s with "%20"
 * */
public class Urlify {

    final char TO_REPLACE = ' ';
    final String REPLACEMENT = "%20";

    public String urlify(String s) {
        char chars[] = s.toCharArray();
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < chars.length; i++) {
            if(chars[i] == TO_REPLACE) {
                result.append(REPLACEMENT);
            } else {
                result.append(chars[i]);
            }
        }

        return result.toString();
    }

}
