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
        int count = 0;
        for (int i = 0; i < (s.size() - (m - 1)); i++) {

            final List<Integer> subList = s.subList(i, i + m);

            int subListSum = 0;
            for (int j = 0; j < subList.size(); j++) {
                subListSum += subList.get(j);
            }

            if (subListSum == d)
                count+=1;

        }

        return count;

    }

}
