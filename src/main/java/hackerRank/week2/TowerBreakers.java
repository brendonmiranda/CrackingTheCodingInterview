package hackerRank.week2;

public class TowerBreakers {

    public static int towerBreakers(int n, int m) {

        // 2 players
        // n = n towers
        // m = height
        // x = current_height
        // y = reduceTo in which ((y>=1) && (y<x)) // evenly divides x
        // assumed that player 2 always mirrors player 1's moves (this is not written and was found in the discussions)

        // 2 (6)
        // p1 6 -> 3
        // p2 6 -> 3
        // p1 3 -> 1
        // p2 3 -> 1
        // p1 loses
        // return p2

        // p1 6 -> 1
        // p2 6 -> 1
        // p1 loses
        // return p2

        // 2 (2)
        // p1 -> 2 -> 1
        // p2 -> 2 -> 1
        // p1 loses
        // return p2

        // 1 (4)
        // p1 -> 4 -> 1
        // p1 wins


        // 2 (1)
        // p1 loses
        // return 2
        // that's the case for m == 1. That means p1 has no moves therefore loses (wtfff)

        // also the below is true because towers can directly be reduced to 1.
        if (n%2 == 0 || m == 1 ) {
            return 2;
        } else {
            return 1;
        }

        // If you are here because the description doesn't match the results, you gotta consider that a tower can be reduced directly to 1. example:
        // 2 towers of height 7
        // p1: 7 -> 1 (x=1 y=6 -> x divides y)
        // p2: 7 -> 1 (x=1 y=6 -> x divides y)
        // p1 loses
        // p2 wins, therefore returns p2

        // the description says that y should divide x but in reality x should divide y
        // best of luck. brendon!

    }

}
