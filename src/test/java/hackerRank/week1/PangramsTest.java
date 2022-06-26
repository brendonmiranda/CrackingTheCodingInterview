package hackerRank.week1;

import hackerRank.week1.Pangrams;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PangramsTest {

    @Test
    public void test() {
        Pangrams pangrams = new Pangrams();

        Assertions.assertEquals("pangram",
                pangrams.pangrams("We promptly judged antique ivory buckles for the next prize"));

        Assertions.assertEquals("not pangram",
                pangrams.pangrams("We promptly judged antique ivory buckles for the prize"));
    }

}
