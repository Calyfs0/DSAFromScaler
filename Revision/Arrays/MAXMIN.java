import java.util.ArrayList;
import java.util.Collections;

public class MAXMIN {
    public int solve(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        return (A.get(A.size() - B) - A.get(B-1));
    }
}
