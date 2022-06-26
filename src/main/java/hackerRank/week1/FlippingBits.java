package hackerRank.week1;

/**
 * Problem statement: https://github.com/brendonmiranda/CrackingTheCodingInterview/blob/main/src/main/resources/one-month-preparation-kit-flipping-bits-English.pdf
 */
public class FlippingBits {

    public long flippingBits(long n) {
        return ((long) Math.pow(2, 32) -1 )^ n;
    }

}
