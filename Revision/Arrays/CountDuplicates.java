import java.util.HashSet;
import java.util.List;;

public class CountDuplicates {
    public int solve(final List<Integer> A) {

        HashSet<Integer> hs = new HashSet<Integer>();
        int ans = 0;
        for (int i = 0; i < A.size(); i++) {
            if (hs.contains(A.get(i)))
                ans++;
            else
                hs.add(A.get(i));
        }

        return ans;
    }
}
