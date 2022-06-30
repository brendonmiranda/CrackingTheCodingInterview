package hackerRank.week1;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem statement: https://github.com/brendonmiranda/CrackingTheCodingInterview/blob/main/src/main/resources/one-month-preparation-kit-countingsort1-English.pdf
 * I guess this is a O(n) solution. The arrayList add() operation will be o(1) because I'm adding at the last index, and I won't need to resize the array.
 * Also, the set() operation will only replace the value in the index. No shift or resize is needed, so o(1).
 *
 * I would be able to avoid the first loop if I could return an array of primitive int instead of an arrayList of Integers.
 * I'd be able to initialize an int array that has 0 as default value for each index. e.g. new int[] array = new int[100]
 */
public class CountingSort1 {

    public List<Integer> countingSort(List<Integer> arr) {

        final List<Integer> res = new ArrayList<>(100);

        for (int i = 0; i < 100; i++) {
            res.add(0);
        }

        for (Integer v : arr) {
            if (v < 100) {
                res.set(v, res.get(v) + 1);
            }
        }

        return res;

    }

}
