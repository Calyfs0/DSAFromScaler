public class SingleNumber {
    public int singleNumber(final int[] A) {
        int output = 0;
        for (int i = 0; i < A.length; i++) {
            output ^= A[i];
        }

        return output;
    }
}
