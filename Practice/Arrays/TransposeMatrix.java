public class TransposeMatrix {
    public int[][] solve(int[][] A) {

        int[][] transpose = new int[A[0].length][A.length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                transpose[j][i] = A[i][j];
            }
        }

        return transpose;

    }
}
