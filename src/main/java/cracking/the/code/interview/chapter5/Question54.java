package cracking.the.code.interview.chapter5;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a positive integer, print the next smallest and the next largest number that have the same number of 1 bits in their binary representation.
 */
public class Question54 {

    // my thoughts on that:
    // n = 11011001111100 = 13948
    // if I find the first 0 and first 1 from the right to left and flip then I should find the next smallest
    // if I find the first 0 that have as a predecessor a 1 I should call it bit "p" and flip it. Then I should organize all the bits before p putting all the 1's to the right and all the 0's to the left then I should find the next largest.
    // if I don't find a zero that have as predecessor a 1 such as 1111111111111 (decimal 16382)


// sample 1:
// 11011001111100 = 13948
// 11011010001111 = 13967 = largest
// 11011001111010 = 13946 = smallest

// sample 2:
// 1110010010 = 914
// 1110010100 = 916 = largest
// 1110010001 = 913 = smallest

// sample 3:
// 1111111111111 = 8191
// 10111111111111 = 12287 = largest
// 1111111111111 = 8191 = 0 (return 0 because in this case I'm not able to find the smallest)

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
        if(p0 == null && p1 == null) {
            return 0;
        }

        return clear(set(n, p0), p1);

    }

    private long findNextLargest(long n) {
        return 0; // todo: implement logic
    }

    public Boolean get(long number, int position) {
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


