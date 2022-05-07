package cracking.the.code.interview.chapter5;

/**
 * You have an integer, and you can flip exactly one bit from 0 to 1.
 * Write code to find the length of the longest sequence of 1's you could create.
 */
public class Question53 {

    public static int findLongestSequenceOf1s(long n) {

        // my solution
        // 1. take the binary string format based on the given number
        // 2. loop through each char of the string. remember to invert the loop, so you can go from the right to the left of the binary number.
        // 3. when find 1, add, when find first 0, flip, when find second 0 break the loop and return the value.

        int value = 0;
        boolean flipped = false;

        String binaryString = Long.toBinaryString(n);

        for (int i = binaryString.toCharArray().length; i > 0; i--) {

            char c = binaryString.toCharArray()[i - 1];
            byte v = Byte.parseByte(Character.toString(c));

            if (v == 0) {
                if (!flipped) {
                    value++;
                    flipped = true;
                } else {
                    break;
                }
            } else {
                value++;
            }
        }

        return value;
    }


}
