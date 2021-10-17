import java.util.ArrayList;

public class MultOfPrevAndNext {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {

        ArrayList<Integer> output = new ArrayList<>();

        if (A.size() == 1) {
            output.add(A.get(0));
            return output;
        }
        for (int i = 0; i < A.size(); i++) {
            if (i == 0) {
                output.add(A.get(i) * A.get(i + 1));
            } else if (i == A.size() - 1) {
                output.add(A.get(i) * A.get(i - 1));

            } else {
                output.add(A.get(i - 1) * A.get(i + 1));
            }

        }
        return output;
    }
}
