import java.util.ArrayList;
import java.util.Collections;

public class NobleInteger {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int n = A.size() - 1;
        for (int i = 0; i <= n; i++) {
            int val = A.get(i);
            if (A.get(n) == 0) {
                return 1;
            }
            if (val == n - i) {
                if (A.get(i + 1) != val) {
                    return 1;
                }
            }
        }

        return -1;
    }
}
