package algorithm.recursion;

import java.util.LinkedList;

public class Staircase {

    // n = 4
    // 1111 / 112 / 121 / 211 / 22 / 13 / 31

    public static void main(String... args) {
        int n = 3;
        System.out.println(possibleWayToHopeTheStair2(n));
    }

    /*A child is running up a staircase with n steps and can hope either 1 step, 2 steps, or 3 steps at a time.
    The task is to implement a method to count how many possible ways the child can run up the stairs.*/
    public static int possibleWayToHopeTheStair(int n) {

        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 0;
        }

        int hopeThree = possibleWayToHopeTheStair(n - 3);
        int hopeTwo = possibleWayToHopeTheStair(n - 2);
        int hopeOne = possibleWayToHopeTheStair(n - 1);

        return hopeThree + hopeTwo + hopeOne;
    }

    public static int possibleWayToHopeTheStair2(int n) {

        // Solution: you got make the result of n-1,n-2 & n-3 subtract of 1,2 and 3 and its solution to subtract of 1,2,3 and so on, and so on. A cascade!
        // n = 1 // 1

        // n = 2
        // 11/ 2

        // n = 3
        // 111/ 12/ 21 / 3


        if (n == 1)
            return 1;

        int possibility = 0;
        final LinkedList<Integer> stack = new LinkedList<>(); // x2, x0, x-1, x-1, x0, 1,
        stack.add(n - 1);
        stack.add(n - 2);
        stack.add(n - 3);

        while (!stack.isEmpty()) {
            int v = stack.pop();
            if (v == 0)
                possibility++;

            if (v > 0) {
                stack.add(v - 3);
                stack.add(v - 2);
                stack.add(v - 1);

            }
        }

        return possibility;
    }


}
