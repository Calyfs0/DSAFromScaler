public class XORandUnsetBits {
    public static int[][] solve() {
        int[] A = {1, 0, 0, 0, 1};
        int[][] B = {{2, 4},
                {1, 5},
                {3, 5}};

        int b_length = B.length;
        int[][] final_output = new int[b_length][2];
        int count = 0;
        for (int[] x : B) {
            int[] output = new int[2];
            int L = x[0];
            int R = x[1];
            int xor = 0;
            int unset_bits = 0;


            for (int i = L - 1; i < R; i++) {
                xor ^= A[i];
                if (A[i] == 0) {
                    unset_bits++;
                }
            }

            output[0] = xor;
            output[1] = unset_bits;
            final_output[count] = output;
            count++;
        }

        return final_output;
    }
}
