package cracking.the.code.interview.chapter5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Question53Test {

    @Test
    public void test() {

        Assertions.assertEquals(1, Question53.findLongestSequenceOf1s(0));
        Assertions.assertEquals(8, Question53.findLongestSequenceOf1s(0B11011101111));
        Assertions.assertEquals(9, Question53.findLongestSequenceOf1s(0B10011111111));
        Assertions.assertEquals(9, Question53.findLongestSequenceOf1s(0B111101111));
        Assertions.assertEquals(7, Question53.findLongestSequenceOf1s(0B1111110001111));
        Assertions.assertEquals(7, Question53.findLongestSequenceOf1s(0B111111001111));
        Assertions.assertEquals(9, Question53.findLongestSequenceOf1s(0B111111110111111001111));

    }

}
