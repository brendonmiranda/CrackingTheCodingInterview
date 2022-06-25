package hackerRank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SparseArraysTest {

    @Test
    public void test() {

        SparseArrays sparseArrays = new SparseArrays();
        List<Integer> queriesCountList = sparseArrays.matchingStrings(
                new ArrayList<>() {
                    {
                        add("aba");
                        add("baba");
                        add("aba");
                        add("xzxb");
                        add("ab");
                    }
                },
                new ArrayList<>() {
                    {
                        add("aba"); // 2
                        add("xzxb"); // 1
                        add("ab"); // 1
                        add("aba"); // 2
                        add("xzxb"); // 1
                    }
                }
        );

        Assertions.assertEquals(new ArrayList<>() {
            {
                add(2);
                add(1);
                add(1);
                add(2);
                add(1);
            }
        }, queriesCountList);

    }

}
