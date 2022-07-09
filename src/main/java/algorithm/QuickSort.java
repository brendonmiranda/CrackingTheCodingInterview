package algorithm;

public class QuickSort {

    public void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int index = partition(arr, left, right);

        quickSort(arr, left, index - 1);

        quickSort(arr, index, right);
    }

    private int partition(int[] arr, int left, int right) {

        int pivot = arr[(left + right) / 2];

        while (left <= right) {

            // find left element that should be in the right
            while (arr[left] < pivot) {
                left++;
            }

            // find right element that should be in the left
            while (arr[right] > pivot) {
                right--;
            }

            if (left <= right) {
                // swap
                int l = arr[left];
                int r = arr[right];

                arr[left] = r;
                arr[right] = l;

                // keep going
                left++;
                right--;
            }
        }

        return left;
    }


}
