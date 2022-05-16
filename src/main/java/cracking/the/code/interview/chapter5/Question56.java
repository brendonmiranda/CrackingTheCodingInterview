package cracking.the.code.interview.chapter5;

/**
 * Write a function to determine the number of bits you would need to flip to convert integer A to integer B
 */
public class Question56 {

    // a = 11101
    // b = 01111
    // n = 2

    // xor = 10010
    // count how many ones the result of a XOR operation between 'a' and 'b' has
   public int numberOfBitsToFlipToConvertAIntoB(long a, long b) {
        int n = 0;

        long xor = a ^ b;
        while (xor != 0) {
            if((xor & 1L) != 0)
                n++;

            xor = xor >>> 1L;

        }

        return n;
    }

}
