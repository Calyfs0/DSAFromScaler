import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CommonElements {
    public int[] solve(int[] A, int[] B) {

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        List<Integer> l = new ArrayList<Integer>();

        for (int i = 0; i < A.length; i++) {
            int val = hm.getOrDefault(A[i], 0);
            hm.put(A[i], val + 1);
        }

        for (int j = 0; j < B.length; j++) {
            if (hm.size() == 0)
                break;
            if (hm.containsKey(B[j])) {
                if (hm.get(B[j]) == 0) {
                    hm.remove(B[j]);
                } else {
                    l.add(B[j]);
                    hm.put(B[j], hm.get(B[j]) - 1);
                }
            }
        }

        int[] output = new int[l.size()];
        for (int y = 0; y < l.size(); y++) {
            output[y] = l.get(y);
        }
        return output;
    }
}
