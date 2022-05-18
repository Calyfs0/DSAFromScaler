import java.util.List;
import java.util.ArrayList;

public class LowerTriangularMatrix {
    public int solve(final List<ArrayList<Integer>> A) {
        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.get(0).size(); j++) {
                if (A.get(i).get(j) != 0)
                    return 0;
            }
        }

        return 1;
    }
}
