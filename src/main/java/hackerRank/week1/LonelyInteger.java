package hackerRank.week1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Problem statement: https://github.com/brendonmiranda/CrackingTheCodingInterview/blob/main/src/main/resources/one-month-preparation-kit-lonely-integer-English.pdf
 */
public class LonelyInteger {

    public int lonelyInteger(List<Integer> a) {

        Set<Integer> buffer = new HashSet<>();
        int sum = 0;
        int sumOfUniqueElements = 0;

        for (int i : a) {
            sum += i;
            if (!buffer.contains(i)) {
                sumOfUniqueElements += i;
                buffer.add(i);
            }
        }

        return (2 * sumOfUniqueElements) - sum;

    }

}
