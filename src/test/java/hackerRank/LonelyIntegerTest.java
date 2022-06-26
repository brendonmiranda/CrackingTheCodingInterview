package hackerRank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class LonelyIntegerTest {

    @Test
    public void test() {

        LonelyInteger lonelyInteger = new LonelyInteger();

        int r = lonelyInteger.lonelyInteger(List.of(1, 2, 3, 4, 1, 2, 3));

        Assertions.assertEquals(4, r);

    }

}
