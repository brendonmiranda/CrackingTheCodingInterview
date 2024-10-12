package aws;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class GetMaxChargeTest {

    @Test
    public void test() {

        GetMaxCharge getMaxCharge = new GetMaxCharge();

        var input = new ArrayList<Integer>();
        input.add(-2);
        input.add(4);
        input.add(3);
        input.add(-2);
        input.add(1);
        Assertions.assertEquals(4, getMaxCharge.getMaxCharge(input));

        input = new ArrayList<Integer>();
        input.add(-2);
        input.add(4);
        input.add(9);
        input.add(1);
        input.add(-1);
        Assertions.assertEquals(9, getMaxCharge.getMaxCharge(input));

        input = new ArrayList<Integer>();
        input.add(-1);
        input.add(3);
        input.add(2);
        Assertions.assertEquals(3, getMaxCharge.getMaxCharge(input));
    }
}
