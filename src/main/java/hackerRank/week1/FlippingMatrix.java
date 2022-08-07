package hackerRank.week1;

import java.util.List;

/**
 * Problem statement: https://github.com/brendonmiranda/CrackingTheCodingInterview/blob/main/src/main/resources/flipping-the-matrix-English.pdf
 * I guess this is a O(m * r) time complexity solution where m=matrix list size & r=row list size
 */
public class FlippingMatrix {

    public int flippingMatrix(List<List<Integer>> matrix) {

        int sum = 0;

        int matrixSize = matrix.size();
        int matrixHalfSize = matrixSize/2;
        for (int r=0; r<matrixHalfSize; r++) {

            List<Integer> row = matrix.get(r);

            int rowSize = row.size();
            int rowHalfSize = rowSize/2;

            for (int i=0; i<rowHalfSize; i++) {

                int x = Math.max(row.get(i), row.get(rowSize - 1 - i));
                int y = Math.max(x, matrix.get(matrixSize - 1 - r).get(rowSize - 1 - i));
                int z = Math.max(y, matrix.get(matrixSize - 1 - r).get(i));
                sum += z;

            }

        }

        return sum;

    }


}
