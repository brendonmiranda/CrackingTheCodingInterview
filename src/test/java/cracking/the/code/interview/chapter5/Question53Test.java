package cracking.the.code.interview.chapter5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Question53Test {

    @Test
    public void test() {
        Assertions.assertEquals(8, Question53.findLongestSequenceOf1s(1775)); // 11011101111
        Assertions.assertEquals(9, Question53.findLongestSequenceOf1s(1279)); // 10011111111
        Assertions.assertEquals(9, Question53.findLongestSequenceOf1s(495)); // 111101111
    }

}
