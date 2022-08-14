package hackerRank.week2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Problem statement:
 * I guess this a linear solution O(n) where n = list size
 */
public class SalesByMatch {

    public int sockMerchant(int n, List<Integer> ar) {

        int pairs = 0;

        // create a map
        Map<Integer, Integer> socksCountMap = new HashMap<>();

        // for through the list
        for (Integer i: ar) {
            // add the number as the key
            // add the value as a counter
            Integer value = socksCountMap.getOrDefault(i, 0);
            socksCountMap.put(i, ++value);
        }

        // for through the keys of the map
        Set<Integer> keySet = socksCountMap.keySet();

        for (Integer i: keySet) {
            // retrieve the value from the key
            Integer value = socksCountMap.get(i);
            pairs += value/2;
        }

        return pairs;

    }

}
