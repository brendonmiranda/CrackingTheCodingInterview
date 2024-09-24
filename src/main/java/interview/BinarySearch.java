package interview;

public class BinarySearch {

    public int binarySearch(int arr[], int x) {

        int low = 0;
        int high = arr.length -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (x == arr[mid])
                return x;

            if (x < arr[mid])
                high = mid -1;
            else
                low = mid +1;
        }

        return -1;
    }

}
