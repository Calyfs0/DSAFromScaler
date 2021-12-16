public class SumOfAllSubMatrices {
    public int solve(int[][] A) {
        int sum = 0;
        for (int row = 0; row < A.length; row++) {
            for (int col = 0; col < A[0].length; col++) {
                sum += A[row][col] * (row + 1) * (col + 1) * (A.length - row) * (A[0].length - col);
            }
        }

        return sum;
    }
}