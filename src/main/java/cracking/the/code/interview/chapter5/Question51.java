package cracking.the.code.interview.chapter5;

/**
 * You are given two 32-bit numbers, N and M, and two bit positions, i and j. Write a method to insert M into N such that M starts at bit j and ends at bit i.
 * You can assume that the bits j through i have enough space to fit all of M. That is, if M=10011, you can assume that there ate at least 5 bits between j and i.
 * You would not, for example, have j=3 and i=2, because M could not fully fit between bit 3 and 2.
 */
public class Question51 {

    private static final long BITS_32 = (long) Math.pow(2, 32) - 1;

    public static long insertMIntoN(Long n, Long m, int i, int j) {

        // 1. clean the bits of N between i and j, also i and j itself.
        // 2. shift M to the left based on i
        // 3. set M into the N (after clean)

        // if j=6 then 111111111111111111111111111111110000000
        long maskForRightZeros = (BITS_32 << (j + 1));

        // 11111111111111111111111110000000
        long leftOnesRightZeros32Bits = BITS_32 & maskForRightZeros;

        // if i = 2 then 00000000000000000000000000000100 - 1 which is equals 00000000000000000000000000000011
        long onesBeforeStartBits = (1L << i) - 1;

        // 11111111111111111111111110000000 | 00000000000000000000000000000011 = 11111111111111111111111110000011
        long maskToCleanBits = leftOnesRightZeros32Bits | onesBeforeStartBits;

        // if n = 00000000000000000000010000010000 then 00000000000000000000010000010000 & 11111111111111111111111110000011 = 00000000000000000000010000000000
        long nCleaned = n & maskToCleanBits;

        // if m = 10011 and i = 2 then 00000000000000000000000001001100 | nCleaned ( which is 00000000000000000000010000000000)
        return nCleaned | (m << i);

    }

}
