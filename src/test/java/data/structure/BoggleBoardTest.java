package data.structure;

import data.structure.tree.BoggleBoard;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BoggleBoardTest {

    @Test
    public void test() {

        BoggleBoard boggleBoard = new BoggleBoard();

        boggleBoard.boggle(new char[][]{
                        {'A', 'B', 'R', 'Z'},
                        {'R', 'U', 'E', 'A'},
                        {'G', 'E', 'D', 'D'},
                        {'S', 'R', 'L', 'T'},
                        {'O', 'M', 'A', 'K'},
                },
                List.of("APPLE", "BURGER", "NOTE", "MALT", "PAPER", "READ", "RADAR", "SORT"));


    }

}
