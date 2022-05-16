package cracking.the.code.interview.chapter5;

/**
 * Write a function to determine the number of bits you would need to flip to convert integer A to integer B
 */
public class Question56 {

    public static final int BITS_SIZE = 32;

    // a = 11101
    // b = 01111
    // n = 2
    public int numberOfBitsToFlipToConvertAIntoB(long a, long b) {
        int n = 0;

        long xor = a ^ b;
        for (int i = 0; i < BITS_SIZE; i++) {
            if (get(xor, i)) {
                n++;
            }
        }

        return n;
    }

    private boolean get(long n, int position) {
        return (n & (1L << position)) != 0;
    }

}
