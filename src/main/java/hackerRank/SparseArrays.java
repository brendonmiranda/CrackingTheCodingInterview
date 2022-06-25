package hackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Problem statement: https://github.com/brendonmiranda/CrackingTheCodingInterview/blob/main/src/main/resources/one-month-preparation-kit-sparse-arrays-English.pdf
 * This is a O(s+q) time complexity solution where s=strings list and q=queries list.
 * It's more performant than the traditional quadratic time complexity solution O(s*q) where we create two nested For loops.
 */
public class SparseArrays {

    public List<Integer> matchingStrings(List<String> strings, List<String> queries) {

        final Map<String, Integer> stringsCountMap = new HashMap<>();

        for (String s : strings) {
            int count = stringsCountMap.getOrDefault(s, 0);
            stringsCountMap.put(s, ++count);
        }

        final List<Integer> queriesCountList = new ArrayList<>();

        for (String s : queries) {
            int count = stringsCountMap.getOrDefault(s, 0);
            queriesCountList.add(count);
        }

        return queriesCountList;

    }

}
