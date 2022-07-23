package hackerRank.week1;

import java.util.List;

/**
 * Problem statement: https://github.com/brendonmiranda/CrackingTheCodingInterview/blob/main/src/main/resources/one-month-preparation-kit-the-birthday-bar-English.pdf
 * This is a window sliding problem. For understanding support please check: https://www.geeksforgeeks.org/window-sliding-technique/
 * I guess the time complexity would be O(s*m) where s = the array size & m = segment size
 */
public class SubArrayDivision1 {

    public int birthday(List<Integer> s, int d, int m) {

        /* The length of the segment = Ron's birthMONTH
            The sum of the integers on the square = Ron's birthDAY

            s is not empty

            m is not 0
            m is <= 12

            d is not 0
            d is <= 31

            value in square is not 0
            value in square is less than <= 5

            sample: m=2, d=3
            s = 1 2 1 3 2

            chocolate
            \_1_|
            \_2_|
            \_1_|
            \_3_|
            \_2_|

         */

        int sum = 0; // the sum of the sublist
        int count = 0; // how many sublist sums to Ron's birthday

        List<Integer> firstSublist = s.subList(0, m); // first sublist

        for (Integer i : firstSublist) { // create a for to count the first sublist
            sum += i;
        }

        if (sum == d) { // check if it sums to his birthday
            count++;
        }

        // create a for
        for (int i = 1; i <= s.size() - m; i++) {

            sum -= s.get(i - 1); // remove the first index of the previous sublist from the sum

            sum += s.get((i + m) - 1); // add the last index of the previous sublist +1 to the sum

            if (sum == d) {
                count++;
            }
        }

        return count;
    }

}
