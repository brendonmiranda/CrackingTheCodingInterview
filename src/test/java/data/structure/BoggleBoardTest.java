package data.structure;

import data.structure.tree.BoggleBoard;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class BoggleBoardTest {

    @Test
    public void test() {

        BoggleBoard boggleBoard = new BoggleBoard();

        Set<String> words = boggleBoard.boggle(new char[][]{
                        {'A', 'B', 'R', 'Z'},
                        {'R', 'U', 'E', 'A'},
                        {'G', 'E', 'D', 'D'},
                        {'S', 'R', 'L', 'T'},
                        {'O', 'M', 'A', 'K'},
                },
                new String[]{"APPLE", "BURGER", "NOTE", "MALT", "PAPER", "READ", "RADAR", "SORT"});

        Assertions.assertFalse(words.isEmpty());
        Assertions.assertEquals(3, words.size());
        Assertions.assertTrue(words.contains("BURGER"));
        Assertions.assertTrue(words.contains("MALT"));
        Assertions.assertTrue(words.contains("READ"));

    }

}
