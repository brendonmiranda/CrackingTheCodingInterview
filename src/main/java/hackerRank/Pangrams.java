package hackerRank;

import java.util.HashSet;
import java.util.Set;

/**
 * Problem statement: https://hackerrank-challenge-pdfs.s3.amazonaws.com/226682-one-month-preparation-kit-pangrams-English?AWSAccessKeyId=AKIAR6O7GJNX5DNFO3PV&Expires=1655330151&Signature=p2nWu8MfJpS8j8WHlBVp8l3Rg3w%3D&response-content-disposition=inline%3B%20filename%3Done-month-preparation-kit-pangrams-English.pdf&response-content-type=application%2Fpdf
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
