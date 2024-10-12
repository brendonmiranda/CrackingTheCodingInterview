package aws;

public class NumberOfSuitableLocations {

    /**
     * // 2 * abs(x - center[i])
     */
    public int numberOfSuitableLocationsSearch(int[] center, int d) {

        long low = -1000000000L;
        long high = 1000000000L;

        Long min = null;
        Long max = null;

        while (low <= high) {

            long x = low + (high - low) / 2;

            long dis = 0;
            for (int c: center) {
                dis += 2 * (Math.abs(x - c));
            }

            if (dis <= d) {
                min = x;
                high = x - 1;
            } else {
                low = x + 1;
            }

        }

        if (min == null)
            return 0;

        low = -1000000000L;
        high = 1000000000L;
        while (low <= high) {

            long x = low + (high - low) / 2;

            long dis = 0;
            for (int c: center) {
                dis += 2 * (Math.abs(x - c));
            }

            if (dis <= d) {
                max = x;
                low = x + 1;
            } else {
                high = x - 1;
            }

        }

        return Integer.parseInt(String.valueOf((max - min) + 1L));
    }

    // quadratic expensive way of doing the same
    public static int numberOfSuitableLocations(int[] center, int d) {

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        int count = 0;
        for (int x = min; x < max; x++){
            long buffer = 0;

            for (int c = 0; c < center.length; c++) {
                long distance = (2L * (x - center[c]));
                if(distance < 0) {
                    distance = -(distance); // make absolute
                }
                buffer = buffer + distance;
            }
            if (buffer <=d){
                count++;
            }

        }

        return count;

    }




}
