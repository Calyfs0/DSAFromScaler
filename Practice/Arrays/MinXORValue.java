public class MinXORValue {
    public int findMinXor(int[] A) {
        Arrays.sort(A);
        if (A.length == 1) {
            return A[0];
        }
        int min = A[0] ^ A[1];
        for (int i = 2; i < A.length; i++) {
            int xor = A[i] ^ A[i - 1];
            if (xor < min)
                min = xor;
        }

        return min;
    }
}
