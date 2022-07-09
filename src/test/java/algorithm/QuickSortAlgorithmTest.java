package algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuickSortAlgorithmTest {

    @Test
    public void test() {
        QuickSortAlgorithm quickSortAlgorithm = new QuickSortAlgorithm();

        int[] arr = new int[]{10, 2, 3, 4, 5, 9, 8, 7, 6, 1};
        quickSortAlgorithm.quickSort(arr, 0, arr.length - 1);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, arr);

        arr = new int[]{0, 2, 1};
        quickSortAlgorithm.quickSort(arr, 0, arr.length - 1);
        Assertions.assertArrayEquals(new int[]{0, 1, 2}, arr);

        arr = new int[]{1, 1, 0};
        quickSortAlgorithm.quickSort(arr, 0, arr.length - 1);
        Assertions.assertArrayEquals(new int[]{0, 1, 1}, arr);

        arr = new int[]{7, 3, 4, 5, 1, 10, 2, 8, 6, 9};
        quickSortAlgorithm.quickSort(arr, 0, arr.length - 1);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, arr);
    }

}
