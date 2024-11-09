package hackerRank.week1;

import hackerRank.week1.LonelyInteger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class LonelyIntegerTest {

    @Test
    public void test() {

        LonelyInteger lonelyInteger = new LonelyInteger();

        int r = lonelyInteger.lonelyInteger(List.of(1, 2, 3, 4, 1, 2, 3));

        Assertions.assertEquals(4, r);

        r = lonelyInteger.lonelyInteger(List.of(1, 2, 3, 4, 5, 1, 2, 3, 4));

        Assertions.assertEquals(5, r);

    }

}
