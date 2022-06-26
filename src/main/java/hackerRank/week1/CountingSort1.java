package hackerRank.week1;

import java.util.ArrayList;
import java.util.List;

public class CountingSort1 {

    public List<Integer> countingSort(List<Integer> arr) {

        final List<Integer> res = new ArrayList<>(100);

        for (int i = 0; i < 100; i++) {
            res.add(i, 0);
        }


        for (Integer v : arr) {
            if (v <= 100) {
                res.set(v, res.get(v) + 1);
            }
        }

        return res;

    }

}
