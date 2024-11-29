package aws;

import java.util.*;

public class PnL {

    public static void main(String... args) {



        List<Integer> pnl2 = new ArrayList<>();
        pnl2.add(5);
        pnl2.add(3);
        pnl2.add(1);
        pnl2.add(2);
        System.out.println(maximizeNegativePnLMonths(pnl2));

        List<Integer> pnl3 = new ArrayList<>();
        pnl3.add(1);
        pnl3.add(1);
        pnl3.add(1);
        pnl3.add(1);
        pnl3.add(1);
        System.out.println(maximizeNegativePnLMonths(pnl3));

        List<Integer> pnl4 = new ArrayList<>();
        pnl4.add(5);
        pnl4.add(2);
        pnl4.add(3);
        pnl4.add(5);
        pnl4.add(2);
        pnl4.add(3);
        System.out.println(maximizeNegativePnLMonths(pnl4));


    }

    public static int maximizeNegativePnLMonths(List<Integer> pnl) {

        // index (i) = month
        // pnl[i] = a representation of money  (profit or loss)

        // pnl[i] * -1 (TURN IT LOSS)

        // maxNumberOfMonths afford to have a negative PnL
        // such that the cumulative for each of the n months is > 0


//         [5,3,1,2i]
//        int sum = 0; // 5 -> 2 -> 1 -> -1 (1)
//        int i = 0; // 1 -> 2 -> 3 -> 4
//        int nMonths = 0; // 2


//        // [1, 1i, 1, 1, 1]
//        int sum = 0; // 1 -> 2 (0) ->
//        int i = 0; // 1
//        int nMonths = 0; // 0


//        [5, x2, 3, x5, 2, 3i]
//
//        int sum = 0; // 5 -> 3 -> (0) 6 -> 1 -> (-1) 3 -> 0
//        int i = 0; // 6 // finish
//        int nMonths = 0; // 2


        //        [5, x2, 3, 5, x2, x3]

        int sum = 0;
        for (Integer i : pnl) {
            sum += i;
        }

        pnl.sort(Comparator.naturalOrder());

        int n = 0;
        for (Integer v : pnl) {

            sum = sum - (2 * v);

            if (sum > 0)
                n++;
            else
                break;


        }

        return n;

    }


/*    int sum = 0;
    int i = 0;
    int nMonths = 0;
        for (Integer v : pnl) {

        if (i == 0) {
            sum += v;
            i++;
            continue;
        }

        sum = sum + (v * -1);
        if (sum > 0) {
            nMonths++;
        } else {
            sum = (sum + v) + v; //rollback, plus v
        }

        i++;
    }

        return nMonths;*/


}