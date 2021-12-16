public class SingleNumberIII {
    public int[] solve(int[] A) {
        int xor = 0;

        for (int i = 0; i < A.length; i++) {
            xor ^= A[i];
        }
        int index = 0;
        for (int i = 0; i < 31; i++) {
            if ((xor & (1 << i)) > 0) {
                index = i;
                break;
            }

        }

        int val1 = 0;
        int val2 = 0;

        for (int i = 0; i < A.length; i++) {
            if ((A[i] & (1 << index)) > 0) {
                val1 ^= A[i];
            } else {
                val2 ^= A[i];
            }
        }

        return new int[] { Math.min(val1, val2), Math.max(val1, val2) };
    }
}