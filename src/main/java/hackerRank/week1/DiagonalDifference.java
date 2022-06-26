package hackerRank.week1;

import java.util.List;

public class DiagonalDifference {

    public int diagonalDifference(List<List<Integer>> arr) {

        // 1 2 3 1 = index 0, index 3
        // 4 5 6 2 = index 0+1, index 3-1
        // 1 2 3 2 = index 1+1, index 2-1
        // 1 3 4 6

        int firstDiagonalSum = 0;
        int secondDiagonalSum = 0;

        int indexForFirstDiagonal = 0;
        int indexForSecondDiagonal = arr.get(0).size() - 1;

        for (final List<Integer> line : arr) {
            firstDiagonalSum += line.get(indexForFirstDiagonal);
            secondDiagonalSum += line.get(indexForSecondDiagonal);

            indexForFirstDiagonal++;
            indexForSecondDiagonal--;
        }

        final int result = firstDiagonalSum - secondDiagonalSum;

        return result < 0 ? -result : result;
    }

}
