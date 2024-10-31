package data.structure.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BracketsTest {

    @Test
    public void test() {
        Brackets brackets = new Brackets();
        Assertions.assertTrue(brackets.balancedBracket("(([{}]))"));
        Assertions.assertFalse(brackets.balancedBracket("(([{]))"));
        Assertions.assertFalse(brackets.balancedBracket("(([{}]{)"));

    }

}
