package hackerRank.week1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LonelyInteger {

    public int lonelyInteger(List<Integer> a) {

        Set<Integer> integerSet = new HashSet<>();

        long listSum = 0;
        long setSum = 0;

        for (Integer i : a) {
            integerSet.add(i);
            listSum += i;
        }

        for (Integer i : integerSet) {
            setSum += i;
        }

        return Long.valueOf((2 * setSum) - listSum).intValue();

    }

}
