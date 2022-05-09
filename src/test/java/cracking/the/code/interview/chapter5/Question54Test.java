package cracking.the.code.interview.chapter5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class Question54Test {

    // main test
    @Test
    public void test() {
        Question54 question54 = new Question54();

        Map<Question45Return, Long> map = question54.smallestAndLargestForTheSameNumberOf1s(13948);
        Assertions.assertEquals(13946, map.get(Question45Return.SMALLEST));
        Assertions.assertEquals(13967, map.get(Question45Return.LARGEST));

        map = question54.smallestAndLargestForTheSameNumberOf1s(914);
        Assertions.assertEquals(913, map.get(Question45Return.SMALLEST));
        Assertions.assertEquals(916, map.get(Question45Return.LARGEST));

        map = question54.smallestAndLargestForTheSameNumberOf1s(8191);
        Assertions.assertEquals(0, map.get(Question45Return.SMALLEST));
        Assertions.assertEquals(12287, map.get(Question45Return.LARGEST));

    }

    // testing logic support methods
    @Test
    public void get() {
        Question54 question54 = new Question54();
        // 42 = 101010
        Assertions.assertFalse(question54.get(42, 0));
        Assertions.assertTrue(question54.get(42, 1));
        Assertions.assertFalse(question54.get(42, 2));
        Assertions.assertTrue(question54.get(42, 3));
    }

    @Test
    public void set() {
        Question54 question54 = new Question54();
        Assertions.assertEquals(0B111, question54.set(0B101, 1));
        Assertions.assertEquals(0B1101, question54.set(0B101, 3));
        Assertions.assertEquals(0B101, question54.set(0B101, 0));
    }

    @Test
    public void clear() {
        Question54 question54 = new Question54();
        Assertions.assertEquals(0B1010, question54.clear(0B1110, 2));
        Assertions.assertEquals(0B1100, question54.clear(0B1110, 1));
        Assertions.assertEquals(0B0110, question54.clear(0B1110, 3));
    }

}
