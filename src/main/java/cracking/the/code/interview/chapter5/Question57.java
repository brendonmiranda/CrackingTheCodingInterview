package cracking.the.code.interview.chapter5;

/**
 * Write a program to swap odd and even bits in an integer with as few instructions as possible.
 */
public class Question57 {

    // 00010111 input
    // 00101110   << even
    // 00001011   >>> odd
    // 00101011 result
    public long swap(long n) {

        long even = n >>> 1L; // switch n to the right, so we move the odd bits to the even bits
        long odd = n << 1L; // switch n to the left, so we move the even bits to the odds bits

        long mask = 0;
        for (int i = 1; i < 32; i = i + 2) {
            mask = (mask | 1L << i);
        }
        // mask = 10101010101010101010101010101010

        // clean odd positions in the even var above and then set odd into it using OR
        // 00001011
        // 01010101 & (~mask)
        // --------
        // 00000001
        long r1 = even & (~mask);

        // clean even positions in the odd var above and then set odd into it using OR
        // 00101110
        // 10101010 & (mask)
        // --------
        // 00101010
        long r2 = odd & mask;

        // merge results using OR
        // 00000001
        // 00101010
        // --------
        // 00101011

        return r1 | r2;


    }

}
