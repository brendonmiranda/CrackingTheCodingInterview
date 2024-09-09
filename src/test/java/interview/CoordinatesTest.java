package interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoordinatesTest {

    @Test
    public void test() {

        final Coordinates coordinates = new Coordinates();
        coordinates.move(true, false); // 1, 0
        coordinates.move(true, true); // 1, 1
        coordinates.move(true, false); // 1, 0
        coordinates.move(true, true); // 1, 1
        coordinates.move(false, true); // 0, 1
        coordinates.move(true, false); // 1, 0

        var x = coordinates.getX();
        var y = coordinates.getY();

        Assertions.assertEquals(2, x);
        Assertions.assertEquals(-1, y);
    }

}
