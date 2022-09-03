package data.structure;

import data.structure.tree.BoggleBoard;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BoggleBoardTest {

    @Test
    public void test() {

        BoggleBoard boggleBoard = new BoggleBoard();

        boggleBoard.boggle(List.of(
                List.of('A', 'B', 'R', 'Z'),
                List.of('R', 'U', 'E', 'A'),
                List.of('G', 'E', 'D', 'D'),
                List.of('S', 'R', 'L', 'T'),
                List.of('O', 'M', 'A', 'K')),

                List.of("APPLE", "BURGER", "NOTE", "MALT", "PAPER", "READ", "RADAR", "SORT"));


    }

}
