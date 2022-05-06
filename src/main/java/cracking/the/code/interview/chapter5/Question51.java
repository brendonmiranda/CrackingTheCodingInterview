package cracking.the.code.interview.chapter5;

/**
 * You are given two 32-bit numbers, N and M, and two bit positions, i and j. Write a method to insert M into N such that M starts at bit j and ends at bit i.
 * You can assume that the bits j through i have enough space to fit all of M. That is, if M=10011, you can assume that there ate at least 5 bits between j and i.
 * You would not, for example, have j=3 and i=2, because M could not fully fit between bit 3 and 2.
 */
public class Question51 {

    public static long insertMIntoN(Long n, Long m, int i, int j) {

        return n | (m << i);

    }

}
