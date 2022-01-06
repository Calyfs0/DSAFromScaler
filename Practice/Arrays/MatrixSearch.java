public class MatrixSearch {
    public int searchMatrix(int[][] A, int B) {
        int i = 0;
        int j = A[0].length - 1;

        while (i < A.length && j >= 0) {
            if (B == A[i][j])
                return 1;
            else if (B < A[i][j])
                j--;
            else
                i++;
        }

        return 0;
    }
}
