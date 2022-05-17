package cracking.the.code.interview.chapter5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Question53Test {

    @Test
    public void test() {

        Assertions.assertEquals(2, Question53.findLongestSequenceOf1s(1));
        Assertions.assertEquals(1, Question53.findLongestSequenceOf1s(0));
        Assertions.assertEquals(8, Question53.findLongestSequenceOf1s(0B11011101111));
        Assertions.assertEquals(9, Question53.findLongestSequenceOf1s(0B10011111111));
        Assertions.assertEquals(9, Question53.findLongestSequenceOf1s(0B111101111));
        Assertions.assertEquals(7, Question53.findLongestSequenceOf1s(0B1111110001111));
        Assertions.assertEquals(7, Question53.findLongestSequenceOf1s(0B111111001111));
        Assertions.assertEquals(15, Question53.findLongestSequenceOf1s(0B111111110111111001111));
        Assertions.assertEquals(3, Question53.findLongestSequenceOf1s(0B01010101010));
        Assertions.assertEquals(11, Question53.findLongestSequenceOf1s(0B1111111111));
        Assertions.assertEquals(1, Question53.findLongestSequenceOf1s(0B0000000000));
        Assertions.assertEquals(2, Question53.findLongestSequenceOf1s(0B0000010000));

    }

}
