package aws;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeAmazonTest {

    @Test
    public void test() {
        IsSpecialSequence palindromeAmazon = new IsSpecialSequence();

        assertTrue(palindromeAmazon.isSpecialSequence("abcad"));
        assertTrue(palindromeAmazon.isSpecialSequence("abccba"));
        assertFalse(palindromeAmazon.isSpecialSequence("abcdef"));

    }
}