package interview;

import java.util.HashMap;
import java.util.Map;

public class Palindrome {

    public static void main(String... args) {

        System.out.println(numberOfWaysToMakeAPalindrome("abccd"));
    }

    public static int numberOfWaysToMakeAPalindrome(String s) {

        Map<Character, Integer> countMap = new HashMap<>();
        var arr = s.toCharArray();

        for (char c : arr) {
            int count = countMap.getOrDefault(c, 0);
            countMap.put(c, ++count);
        }

        int oddCount = 0;
        for (Integer value : countMap.values()) {
            if (value % 2 != 0)
                oddCount++;
        }

        if (oddCount == 0)
            return 26 + 1;

        if (oddCount == 1)
            return 1;

        if (oddCount == 2) // i forgot this edge case
            return 2;


        return 0;
    }

    // if pair
    // there should have a pair amount of any character in the string
    // odd
    // if odd
    // only one character present can be of an odd amount

}
