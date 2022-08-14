package hackerRank.week2;

/**
 * Problem statement: https://github.com/brendonmiranda/CrackingTheCodingInterview/blob/main/src/main/resources/one-month-preparation-kit-drawing-book-English.pdf
 */
public class DrawingBook {

    public int pageCount(int n, int p) {

        // [_ 1][2 3][4 5][6 7]

        int front = p/2;

        int back = (n / 2) - front;

        return Math.min(front, back);

    }

}
