package hackerRank;

import java.util.HashSet;
import java.util.Set;

/**
 * Problem statement: https://github.com/brendonmiranda/CrackingTheCodingInterview/blob/95e39ba850b3bc12a6285baa68cd1ef0eb6fdf9c/src/main/resources/one-month-preparation-kit-pangrams-English.pdf
 */
public class Pangrams {

    public String pangrams(final String s) {

        final String value = s.toLowerCase();
        final int count = value.length();
        final char space = " ".charAt(0);

        if (count >= 26) {
            final Set<Character> set = new HashSet<>();

            for (int i = 0; i < count; i++) {
                if (value.charAt(i) != space) {
                    set.add(value.charAt(i));
                }
            }

            if (set.size() == 26) {
                return "pangram";
            }
        }

        return "not pangram";
    }


}
