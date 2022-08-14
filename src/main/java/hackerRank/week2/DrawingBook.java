package hackerRank.week2;

/**
 * Problem statement: https://github.com/brendonmiranda/CrackingTheCodingInterview/blob/main/src/main/resources/one-month-preparation-kit-drawing-book-English.pdf
 */
public class DrawingBook {

    public int pageCount(int n, int p) {

        // [_ 1][2 3][4 5][6 7]

        // checks how many pages I need to flip to go to the page p from the front of the book
        int front = p/2;

        // checks how many pages I need to flip to go to the last page and subtract the value above
        // this is going to give me how many pages I need to flip to go to page p from the back of the book
        int back = (n / 2) - front;

        // return the minimum value
        return Math.min(front, back);

    }

}
