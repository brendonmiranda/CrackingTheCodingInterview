package cracking.the.code.interview.chapter5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Question56Test {

    @Test
    public void test() {
        Question56 question = new Question56();
        Assertions.assertEquals(2, question.numberOfBitsToFlipToConvertAIntoB(0b11101, 0b01111));
        Assertions.assertEquals(3, question.numberOfBitsToFlipToConvertAIntoB(0b11100, 0b01111));
        Assertions.assertEquals(6, question.numberOfBitsToFlipToConvertAIntoB(0b11111100, 0b00001111));
    }

}
