package hackerRank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FlippingBitsTest {

    @Test
    public void test() {
        FlippingBits flippingBits = new FlippingBits();
        long r = flippingBits.flippingBits(0B00000000000000000000000000000001);

        Assertions.assertEquals(4294967294L, r); // 11111111111111111111111111111110
    }

}
