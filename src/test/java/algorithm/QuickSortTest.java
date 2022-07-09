package algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuickSortTest {

    @Test
    public void test() {
        QuickSort quickSort = new QuickSort();

        int[] arr = new int[]{10, 2, 3, 4, 5, 9, 8, 7, 6, 1};
        quickSort.quickSort(arr, 0, arr.length - 1);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, arr);

        arr = new int[]{0, 2, 1};
        quickSort.quickSort(arr, 0, arr.length - 1);
        Assertions.assertArrayEquals(new int[]{0, 1, 2}, arr);

        arr = new int[]{1, 1, 0};
        quickSort.quickSort(arr, 0, arr.length - 1);
        Assertions.assertArrayEquals(new int[]{0, 1, 1}, arr);
    }

}
