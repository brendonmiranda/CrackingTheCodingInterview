package aws;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventoryManagementSystem {

    public static void main(String... args) {

        System.out.println(getMinimumChange(List.of(1,3,1,3), 2));

    }

    public static int getMinimumChange(List<Integer> prod_price, int k) {


        // [5,7,7,8,3]
        // 5,7 // 7,7// 7,8// 8,3
        // Map
//        5, 1
//        7, 4
//        8, 2
//        3, 1

        // [5,7,7,8]
        // 5,7 // 7,7// 7,8
        // Map
//        5, 1
//        7, 4
//        8, 1


        // [1,3,1,3]
        // 1,3 // 3,1 // 1,3
        // Map
//        1, 3
//        3, 3


        // [1,3,2,1,3] k=3
        // 1,3,2
        // 3,2,1
        // 2,1,3
        // Map
//        1, 3
//        2, 3
//        3, 3

        int changes = 0;
        Map<Integer, Integer> mapCount = new HashMap<>();
        int maxRepeated = 0;
        for (int i = 0; i < prod_price.size(); i++) {
            var sub = prod_price.subList(i, i + (k - 1));

            for (int v : sub) {
                int count = mapCount.getOrDefault(v, 0);
                mapCount.put(v, ++count);
                maxRepeated = Math.max(maxRepeated, mapCount.get(v));
            }

        }

        for (Integer value : mapCount.values()) {
            if (value != maxRepeated)
                changes++;
        }

        return changes;

    }

/*    public static int getMinimumChange(List<Integer> prod_price, int k) {

        // [1,3,2,1,3], k=3
        // [5,7,7,8], k=2
        // [1,3,1,3], k=2
        int changes = 0;
        for (int i = 0; i < k; i++) {

            Map<Integer, Integer> countMap = new HashMap<>();
            int maxRepeat = 0;
            int groupSize = 0;

            for (int j = i; j < prod_price.size(); j += k) {
                int value = prod_price.get(j);
                int count = countMap.getOrDefault(value, 0);
                countMap.put(value, ++count);
                maxRepeat = Math.max(maxRepeat, countMap.get(value));

                groupSize++;
            }

            changes = changes + (groupSize - maxRepeat);

        }

        return changes;
    }
*/

}
