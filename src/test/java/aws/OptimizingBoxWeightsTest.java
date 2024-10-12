package aws;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OptimizingBoxWeightsTest {

    @Test
    public void test() {

        OptimizingBoxWeights optimizingBoxWeights = new OptimizingBoxWeights();
        var subA = optimizingBoxWeights.packItems(new int[]{5, 3, 2, 4, 1, 2});
        Assertions.assertEquals(subA[0], 4);
        Assertions.assertEquals(subA[1], 5);

        subA = optimizingBoxWeights.packItems(new int[]{4, 2, 5, 1, 6});
        Assertions.assertEquals(subA[0], 5);
        Assertions.assertEquals(subA[1], 6);

        subA = optimizingBoxWeights.packItems(new int[]{3, 7, 5, 6, 2});
        Assertions.assertEquals(subA[0], 6);
        Assertions.assertEquals(subA[1], 7);
    }

}