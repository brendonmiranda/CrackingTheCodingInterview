package hackerRank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class DiagonalDifferenceTest {

    @Test
    public void test() {

        DiagonalDifference diagonalDifference = new DiagonalDifference();
        int r = diagonalDifference.diagonalDifference(
                List.of(List.of(5, 2, 10),
                        List.of(4, 5, 6),
                        List.of(5, 8, 20)));

        Assertions.assertEquals(10, r);

    }


}
