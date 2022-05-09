package cracking.the.code.interview.chapter5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given a positive integer, print the next smallest and the next largest number that have the same number of 1 bits in their binary representation.
 */
public class Question54 {

    // my thoughts on that:
    // n = 11011001111100 = 13948
    // if I find the first 0 and first 1 from the right to left and flip then I should find the next smallest
    // if I find the first 0 that have as a predecessor 1 I should call it bit "p" and flip it and its predecessor (the 1). Then I should organize all the bits before p putting all the 1's to the right and all the 0's to the left then I should find the next largest.

    public Map<Question45Return, Long> smallestAndLargestForTheSameNumberOf1s(long n) {
        Map<Question45Return, Long> response = new HashMap<>();

        long l = findNextLargest(n);
        long s = findNextSmallest(n);

        response.put(Question45Return.LARGEST, l);
        response.put(Question45Return.SMALLEST, s);

        return response;
    }

    /**
     * Find the first 0 and first 1 (10) from the right to the left and flip, then it should find the next smallest.
     * Return 0 when there is no way to have a smaller one with the same amount of 1's.
     *
     * @param n number
     * @return the next smallest number that have the same number of 1's in their binary representation
     */
    private long findNextSmallest(long n) {

        Integer p0 = null;
        Integer p1 = null;

        for (int i = 0; i < 32; i++) { // 32 because I'm considering a 32bits value

            boolean a = get(n, i);
            boolean b = get(n, i + 1);

            // expecting 'a' to be 0 and 'b' to be 1
            if (a == false && b == true) {
                p0 = i;
                p1 = i + 1;
                break;
            }
        }

        // it means that the number doesn't have a sequence such as 10 from the right to the left. The number should look like 1111111111111.
        if (p0 == null && p1 == null) {
            return 0;
        }

        return clear(set(n, p0), p1);

    }

    /**
     * Find the first 0 that have as a predecessor a 1 I should call it bit "p" and flip it. Then I should organize all the bits before p putting all the 1's to the right and all the 0's to the left then I should find the next largest.
     *
     * @param n number
     * @return the next largest number that have the same number of 1's in their binary representation
     */
    private long findNextLargest(long n) {

        Set<Integer> positionsThatHave1 = new HashSet<>();

        Integer predecessor = null;
        Integer p = null;

        // 32 because I'm considering a 32bits value
        for (int i = 0; i < 32; i++) {

            boolean a = get(n, i);
            boolean b = get(n, i + 1);

            // expecting 'a' to be 0 and 'b' to be 1
            if (a == true && b == false) {
                predecessor = i;
                p = i + 1;
                positionsThatHave1.remove(predecessor); // remove predecessor because I'll flip it below
                break;
            }

            if (a == true) {
                positionsThatHave1.add(i);
            }

            if (b == true) {
                positionsThatHave1.add(i + 1);
            }

        }

        n = set(clear(n, predecessor), p); // flip p and its predecessor

        for (Integer position : positionsThatHave1) {
            n = clear(n, position);
        }

        for (int i = 0; i < positionsThatHave1.size(); i++) {
            n = set(n, i);
        }

        return n;
    }

    public boolean get(long number, int position) {
        return (number & (1L << position)) != 0;
    }

    public long set(long number, int position) {
        return number | (1L << position);
    }

    public long clear(long number, int position) {
        return number & ~(1L << position);
    }


}

enum Question45Return {
    SMALLEST,
    LARGEST
}


