public class AntiDiagonals {
    public static void Antidiagonals() {

        int[][] A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int L = A.length + A[0].length - 1;
        int[][] output = new int[L][A[0].length];

        int count = 0;
        for (int i = 0; i < A.length; i++) {
            int s = 0;
            int e = i;

            while (s < A.length && e >= 0) {
                output[count][s] = A[s][e];
                s++;
                e--;
            }
            count++;
        }

        for (int j = 1; j < A.length; j++) {
            int s = j;
            int e = A[0].length - 1;
            int col = 0;
            while (s < A.length && e <= A[0].length) {
                output[count][col] = A[s][e];
                col++;
                s++;
                e--;
            }
            count++;
        }

        System.out.print(output.toString());
    }
}
