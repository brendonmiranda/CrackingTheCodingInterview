package hackerRank.week2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SalesByMatchTest {

    @Test
    public void test() {

        SalesByMatch salesByMatch = new SalesByMatch();

        Assertions.assertEquals(3, salesByMatch.sockMerchant(7, List.of(4,4,4,1,2,2,1)));
        Assertions.assertEquals(2, salesByMatch.sockMerchant(7, List.of(4,6,7,1,2,2,1)));
        Assertions.assertEquals(1, salesByMatch.sockMerchant(7, List.of(1,2,3,4,5,6,6)));

    }

}
