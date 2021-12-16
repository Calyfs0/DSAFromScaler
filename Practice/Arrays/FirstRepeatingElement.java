import java.util.HashMap;

public class FirstRepeatingElement {
    public int solve(int[] A) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for (int i = 0; i < A.length; i++) {
            int val = hm.getOrDefault(A[i], 0);

            hm.put(A[i], val + 1);
        }

        for (int j = 0; j < A.length; j++) {
            if (hm.containsKey(A[j])) {
                if (hm.get(A[j]) > 1)
                    return A[j];
            }
        }

        return -1;
    }
}