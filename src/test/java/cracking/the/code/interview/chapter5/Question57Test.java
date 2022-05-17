package cracking.the.code.interview.chapter5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Question57Test {

    @Test
    public void test() {
        Question57 question57 = new Question57();
        Assertions.assertEquals(0B00101011, question57.swap(0B00010111));
        Assertions.assertEquals(0B01010101, question57.swap(0B10101010));
        Assertions.assertEquals(1, question57.swap(0B10));
        Assertions.assertEquals(0, question57.swap(0));
    }

}
