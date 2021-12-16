import java.util.HashMap;

public class SubArrayWith0Sum {
    public int solve(int[] A) {

        for (int c = 0; c < A.length; c++) {
            if (A[c] == 0)
                return 1;
        }

        long[] pf = new long[A.length];
        pf[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            pf[i] = pf[i - 1] + A[i];
        }

        HashMap<Long, Integer> hm = new HashMap<Long, Integer>();

        for (int k = 0; k < pf.length; k++) {
            if (pf[k] == 0)
                return 1;

            int val = hm.getOrDefault(pf[k], 0);
            if (val == 1)
                return 1;
            hm.put(pf[k], val + 1);
        }

        return 0;

    }
}
