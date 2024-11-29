package aws;

import java.util.HashMap;
import java.util.Map;

public class IsSpecialSequence {

    public boolean isSpecialSequence(String dna_sequence) {
        // palindromic patterns -> dna sequence string
        // special if:
        // can be divided into two non-empty
        // AND the two resulting string can be rearranged to form a palindrome
        // you can remove 1 char from each to make it work

        for (int i = 0; i < dna_sequence.length() - 1; i++) {
            String first = dna_sequence.substring(0, i + 1);
            String second = dna_sequence.substring(i + 1);

            if (isPalindromeSpecial(first) && isPalindromeSpecial(second))
                return true;
        }
        return false;
    }

    private boolean isPalindromeSpecial(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int count = map.getOrDefault(s.charAt(i), 0);
            map.put(s.charAt(i), ++count);
        }

        int oddCount = 0;
        for (Integer value : map.values()) {
            if (value % 2 != 0)
                oddCount++;
        }

        if (s.length() % 2 == 0) {// pair
            if (oddCount > 2)
                return false;
        } else { // odd
            if (oddCount > 1)
                return false;
        }

        return true;
    }


}
