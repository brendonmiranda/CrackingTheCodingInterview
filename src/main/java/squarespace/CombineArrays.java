package squarespace;

public class CombineArrays {

    public static void main(String... args) {
        var arr = combineArrays(new int[]{1, 3, 5}, new int[]{2, 4, 6});
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static int[] combineArrays(int[] a, int[] b) {

        // In:
        // [1, 3, 5]
        // [2, 4, 6]
        //
        // Out:
        // [1,2,3,4,5,6]
        final int aSize = a.length;
        final int bSize = b.length;

        final int[] res = new int[aSize + bSize];

        int i = 0;
        int aIndex = 0;
        int bIndex = 0;


        while (i < aSize + bSize) {

            boolean aReached = aIndex == aSize; // f
            boolean bReached = bIndex == bSize; // f
            if (!aReached && !bReached) {
                int av = a[aIndex]; // a
                int bv = b[bIndex]; // 1 = 1

                if (av < bv) {
                    res[i] = av;
                    aIndex++;
                } else {
                    res[i] = bv;
                    bIndex++;
                }
                i++; // 4
                continue;
            }

            if (!aReached) {
                res[i] = a[aIndex];
                aIndex++;
            }

            if (!bReached) {
                res[i] = b[bIndex];
                bIndex++;
            }

            i++;
        }


        return res;

        // o(n) in which n = aSize + bSize

    }

}
