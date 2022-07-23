package hackerRank.week1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SubArrayDivision1Test {

    @Test
    public void test() {

        SubArrayDivision1 subArrayDivision1 = new SubArrayDivision1();

        Assertions.assertEquals(2, subArrayDivision1.birthday(List.of(1, 2, 1, 3, 2), 3, 2));

        Assertions.assertEquals(0, subArrayDivision1.birthday(List.of(1, 1, 1, 1, 1, 1), 3, 2));

        Assertions.assertEquals(1, subArrayDivision1.birthday(List.of(4), 4, 1));

        Assertions.assertEquals(3, subArrayDivision1.birthday(List.of(2, 5, 1, 3, 4, 4, 3, 5, 1, 1, 2, 1, 4, 1, 3, 3, 4, 2, 1), 18, 7));

    }

}
