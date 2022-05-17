package cracking.the.code.interview.chapter5;

/**
 * You have an integer, and you can flip exactly one bit from 0 to 1.
 * Write code to find the length of the longest sequence of 1's you could create.
 */
public class Question53 {

    public static int findLongestSequenceOf1s(long n) {

        int current = 0;
        int previous = 0;
        int max = 1;

        while (n != 0) {

            if ((n & 1) != 0) {
                current++;
            } else {
                if ((n & 2) != 0) { // next bit is one
                    previous = current;
                } else { // next bit is zero
                    previous = 0;
                }
                current = 0;
            }

            if (max < (current + previous + 1)) {
                max = current + previous + 1;
            }

            n = n >>> 1L;

        }

        return max;

    }


}
