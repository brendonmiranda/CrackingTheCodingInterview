package aws;

import java.util.*;

public class OptimizingBoxWeights {

    /*
        The intersection of A and B is null.
        The union of A and B is equal to the original array.
        The number of elements in subset A is minimal.
        The sum of A's weights is greater than the sum of B's weights.*/
    public static int[] packItems(int[] arr) {

        Arrays.sort(arr);

        int max = arr.length / 2;
        int arrSum = 0;
        int bufferSum = 0;

        final LinkedList<Integer> buffer = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
            if (i >= max) {
                buffer.add(arr[i]);
                bufferSum += arr[i];
            }
        }

        // The sum of A's weights is greater than the sum of B's weights.
        // Subset A must be minimal in size.
        arrSum = arrSum - bufferSum;
        while ((bufferSum - buffer.get(0)) > (arrSum)) {
            // The union of A and B is equal to the original array.
            Integer i = buffer.remove(0);
            arrSum += i;
            bufferSum -= i;

        }

        int[] subA = new int[buffer.size()];
        for (int i = 0; i < buffer.size(); i++) {
            subA[i] = buffer.get(i);
        }

        return subA;

    }


}
