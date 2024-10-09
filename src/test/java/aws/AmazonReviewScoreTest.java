package aws;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AmazonReviewScoreTest {

    @Test
    public void test() {
        AmazonReviewScore amazonReviewScore = new AmazonReviewScore();

        Assertions.assertEquals(15, amazonReviewScore.amazonReviewScore("GoodProductButScrapAfterWash", new String[]{"crap", "odpro"}));
        Assertions.assertEquals(11, amazonReviewScore.amazonReviewScore("FastDeliveryOkayProduct", new String[]{"eryoka", "yo", "eli"}));
        Assertions.assertEquals(20, amazonReviewScore.amazonReviewScore("ExtremeValueForMoney", new String[]{"tuper", "douche"}));
    }

}
