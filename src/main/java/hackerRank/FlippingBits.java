package hackerRank;

public class FlippingBits {

    public long flippingBits(long n) {
        return ((long) Math.pow(2, 32) -1 )^ n;
    }

}
