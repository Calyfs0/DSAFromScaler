public class SingleNumberII {
    public int singleNumber(final int[] A) {
        int ans = 0;

        for (int i = 0; i < 31; i++) {
            int count = 0;
            for (int j = 0; j < A.length; j++) {

                if ((A[j] & (1 << i)) > 0) {
                    count++;
                }
            }
            if (count % 3 != 0) {
                ans += (1 << i);
            }
        }

        return ans;
    }
}
