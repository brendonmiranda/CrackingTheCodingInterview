package cracking.the.code.interview.chapter5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.Long.toBinaryString;

public class Question51Test {

    @Test
    public void test() {

        final long result = 0B10001001100;

        long n = 0B10000000000L;

        final long m = 0B10011L;
        final int i = 2;
        final int j = 6;

        Assertions.assertEquals(toBinaryString(result), toBinaryString(Question51.insertMIntoN(n, m, i, j)));

        n = 0B10000010000L;

        Assertions.assertEquals(toBinaryString(result), toBinaryString(Question51.insertMIntoN(n, m, i, j)));

        n = 0B10000110000L;

        Assertions.assertEquals(toBinaryString(result), toBinaryString(Question51.insertMIntoN(n, m, i, j)));

    }

}
