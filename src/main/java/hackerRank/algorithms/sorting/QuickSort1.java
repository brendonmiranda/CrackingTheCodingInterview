package hackerRank.algorithms.sorting;

import java.util.List;

/**
 * Problem statement: https://github.com/brendonmiranda/CrackingTheCodingInterview/blob/main/src/main/resources/quicksort1-English.pdf
 */
public class QuickSort1 {

    public List<Integer> quickSort(List<Integer> arr) {

        int size = arr.size();

        partition(arr, 0, size - 1);

        return arr;
    }

    private void partition(List<Integer> arr, int left, int right) {
        int p = arr.get(0);
        int m = arr.get((left + right) / 2);

        arr.set((left + right) / 2, p);
        arr.set(0, m);

        while (left <= right) {

            // find the left elements that should be in the right
            while (arr.get(left) < p) {
                left++;
            }

            // find the right element that should be in the left
            while (arr.get(right) > p) {
                right--;
            }


            if (left <= right) {
                // swap
                int l = arr.get(left);
                int r = arr.get(right);

                arr.set(left, r);
                arr.set(right, l);
                // keep going
                left++;
                right--;
            }

        }
    }

}