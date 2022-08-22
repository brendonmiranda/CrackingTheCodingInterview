package interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MaximumNumberOfRepeatedStringsTest {

    @Test
    public void test() {

        MaximumNumberOfRepeatedStrings maximumNumberOfRepeatedStrings = new MaximumNumberOfRepeatedStrings();

        // abc -> bac | acb
        // aab -> aab | aba
        // aba -> baa | aab
        Assertions.assertEquals(2, maximumNumberOfRepeatedStrings.max(List.of("abc", "aab", "aba")));

        // cxa -> xca | cax
        // xac -> axc | xca
        // xac -> axc | xca
        Assertions.assertEquals(3, maximumNumberOfRepeatedStrings.max(List.of("cxa", "xac", "xac")));

    }


}
