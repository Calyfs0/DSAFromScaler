public class RepeatAndMissingElementUsingXOR {
    // DO NOT MODIFY THE ARGUMENTS WITH “final” PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {

        int val1 = 0;
        int val2 = 0;
        int xor = 0;
        for (int i = 0; i < A.length; i++) {
            xor ^= A[i];
        }
        for (int j = 1; j <= A.length; j++) {
            xor ^= j;
        }
        int temp = xor;
        int set_index = 0;

        while (temp > 0) {
            if ((temp & 1) == 1) {
                break;
            } else {
                temp = temp >> 1;
                set_index += 1;
            }
        }

        for (int k = 0; k < A.length; k++) {
            if ((A[k] >> set_index) % 2 == 1) {
                val1 ^= A[k];
            }

        }
        for (int l = 1; l <= A.length; l++) {
            if ((l >> set_index) % 2 == 1) {
                val1 ^= l;
            }
        }

        val2 = val1 ^ xor;
        for (int i = 0; i < A.length; i++) {
            if (val1 == A[i]) {
                return new int[] { val1, val2 };
            }
        }

        return new int[] { val2, val1 };

    }
}