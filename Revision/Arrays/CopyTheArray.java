import java.util.ArrayList;
import java.util.List;

public class CopyTheArray {
    public ArrayList<Integer> solve(final List<Integer> A, int B) {
        ArrayList<Integer> output = new ArrayList<Integer>();

        for (int i = 0; i < A.size(); i++) {
            output.add(A.get(i) + B);
        }

        return output;
    }
}
