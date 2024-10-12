package aws;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReviewScoreTest {

    @Test
    public void test() {
        ReviewScore reviewScore = new ReviewScore();

        Assertions.assertEquals(15, reviewScore.amazonReviewScore("GoodProductButScrapAfterWash", new String[]{"crap", "odpro"}));
        Assertions.assertEquals(11, reviewScore.amazonReviewScore("FastDeliveryOkayProduct", new String[]{"eryoka", "yo", "eli"}));
        Assertions.assertEquals(20, reviewScore.amazonReviewScore("ExtremeValueForMoney", new String[]{"tuper", "douche"}));
    }

}
