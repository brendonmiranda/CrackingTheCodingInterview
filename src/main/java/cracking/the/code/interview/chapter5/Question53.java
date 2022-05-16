package cracking.the.code.interview.chapter5;

/**
 * You have an integer, and you can flip exactly one bit from 0 to 1.
 * Write code to find the length of the longest sequence of 1's you could create.
 */
public class Question53 {

    public static int findLongestSequenceOf1s(long n) {

        int count = 0;
        int total = 0;
        boolean isTheFirstZero = true;

        do {
            if ((n & 1L) != 0) { // it is 1
                count++;
            } else { // it is 0
                if (isTheFirstZero) {
                    count++;
                    isTheFirstZero = false;
                } else { // it is the second zero
                    count = 0;
                    isTheFirstZero = true;

                    // if the next value after the second zero is a 1, it starts the count from this zero (this will be the first zero)
                    if (((n >>> 1L) & 1) != 0) {
                        count = 1;
                        isTheFirstZero = false;
                    }
                }
            }

            if (count > total) {
                total = count;
            }

            n = n >>> 1L;

        } while (n != 0);

        return total;
    }


}
