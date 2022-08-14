package hackerRank.week2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DrawingBookTest {

    @Test
    public void test() {

        DrawingBook drawingBook = new DrawingBook();

        // [_ 1][2 3][4 5][6 7]
        Assertions.assertEquals(0, drawingBook.pageCount(7, 6)); // from the back
        Assertions.assertEquals(1, drawingBook.pageCount(7, 5)); // from the back
        Assertions.assertEquals(1, drawingBook.pageCount(7, 4)); // from the back
        Assertions.assertEquals(1, drawingBook.pageCount(7, 2)); // from the front
        Assertions.assertEquals(0, drawingBook.pageCount(7, 1)); // front the front


    }

}
