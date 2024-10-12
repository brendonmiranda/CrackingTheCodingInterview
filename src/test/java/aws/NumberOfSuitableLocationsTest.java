package aws;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfSuitableLocationsTest {

    @Test
    public void test() {

        NumberOfSuitableLocations numberOfSuitableLocations = new NumberOfSuitableLocations();
        Assertions.assertEquals(3,numberOfSuitableLocations.numberOfSuitableLocationsSearch(new int[]{-2, 1, 0}, 8));
        Assertions.assertEquals(5,numberOfSuitableLocations.numberOfSuitableLocationsSearch(new int[]{2, 0, 3, -4}, 22));
        Assertions.assertEquals(0,numberOfSuitableLocations.numberOfSuitableLocationsSearch(new int[]{-3, 2, 2}, 8));

    }

}
