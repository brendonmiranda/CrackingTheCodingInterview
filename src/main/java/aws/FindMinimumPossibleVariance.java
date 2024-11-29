package aws;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindMinimumPossibleVariance {

    public static void main(String...args) {

        System.out.println(findMinimumVariance(List.of(4, 2, 5, 4)));
        System.out.println(findMinimumVariance(List.of(4, 1, 2, 5, 3, 1, 4)));
        System.out.println(findMinimumVariance(List.of(4, 2, 5, 4, 4, 1, 2)));
    }


/*
    public static int findMinimumVariance(List<Integer> height) {

        // buildings different heights
        // goal: group of building with 2 conditions
        //1. contiguous group with size >= 2
        //2. first and last size of the group got to have the same size

        // variance should be as minimal as possible
        // variance = group size - occurrences of the first building size

        // 4i, 2, 5, 4j

        //4, 2, 5, 4, 3, 1, 4
        //4, 2, 5, 4, 4, 1, 2


        // i0 i3 -> index second - index first
        // size =  (3 - 0) + 1 = 4
        // variance = min(variance, size - 2)

        Integer variance = null;
        for (int i = 0; i < height.size(); i++) {
            int groupSize = 0;
            int occurrencesOfTheFirstBuildingSize = 1; // 2
            int firstBuildingSize = height.get(i); // 4

            for (int j = (i + 1); j < height.size(); j++) {
                groupSize = (j - i) + 1; // (2 - 0) + 1 = 4
                int lastBuildingSize = height.get(j);
                if (lastBuildingSize == firstBuildingSize) {
                    occurrencesOfTheFirstBuildingSize++;
                    int possibleVariance = groupSize - occurrencesOfTheFirstBuildingSize; // 4 - 2
                    variance = Math.min((variance == null ? possibleVariance : variance), possibleVariance);
                }
            }
        }

        return variance == null ? -1 : variance;
    }
*/

    public static int findMinimumVariance(List<Integer> height) {
        Map<Integer, Integer> appear = new HashMap<>();
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < height.size(); i++) {
            int num = height.get(i);

            if (appear.containsKey(num)) {
                result = Math.min(result, i - appear.get(num) - 1);
            }

            appear.put(num, i);
        }

        return result;
    }

}
