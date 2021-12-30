public class MaximumUnsortedSubarraySol1 {
    public int[] subUnsort(int[] A) {

        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }
        Arrays.sort(B);
        int[] output = new int[2];
        boolean isEqual = true;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != B[i]) {
                output[0] = i;
                isEqual = false;
                break;
            }
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] != B[i] && output[0] != i) {
                output[1] = i;
            }
        }

        if (isEqual)
            return new int[] { -1 };
        return output;
    }
}
