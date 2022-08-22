package interview;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Check MaximumNumberOfRepeatedStringsTest.java for the test samples
 */
public class MaximumNumberOfRepeatedStrings {

    /*
     * - you receive a list of string
     * - you can swap the first two character and last two character of this string
     * - from the result of these swaps, return the maximum number of times that the resulted strings would repeat
     *
     */

    public Integer max(List<String> stringList) {

        Map<String, Integer> map = new HashMap<>();

        for(String s: stringList) {

            String firstString = String.valueOf(s.charAt(1) + s.charAt(0) + s.charAt(2));

            String secondString = String.valueOf(s.charAt(0) + s.charAt(2) + s.charAt(1));

            Integer firstValue = map.getOrDefault(firstString, 0);
            Integer secondValue = map.getOrDefault(secondString, 0);

            map.put(firstString, ++firstValue);
            map.put(secondString, ++secondValue);

        }

        int maxValue = 0;
        for (Integer value : map.values()) {
            maxValue = Math.max(maxValue, value);
        }

        return maxValue;

    }


}
