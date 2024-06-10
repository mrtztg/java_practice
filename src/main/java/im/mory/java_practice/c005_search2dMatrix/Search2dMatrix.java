package im.mory.java_practice.c005_search2dMatrix;

public class Search2dMatrix {
    public boolean solution(int[][] matrix, int target) {
//        var row = 0;
//        var column
//        if (target < matrix[0][0] || target > matrix[matrix.length - 1][matrix[0].length - 1]) {
//            return false;
//        }
//        while (row <= matrix.length) {
//            if (target >= matrix[row][0]) {
//                int nextRowToCheck = (matrix.length - row) / 2;
//                if (nextRowToCheck == row) {
//                    while (true) {
//
//                    }
//                } else {
//                    row = nextRowToCheck;
//                }
//            }
//        }

        var m = matrix.length;
        var n = matrix[0].length;
        var left = 0;
        var right = m * n - 1;
        while (left <= right) {
            var mid = (left + right) / 2;
            var midValue = matrix[mid/n][mid%n];

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
