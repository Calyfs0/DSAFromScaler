import java.util.ArrayList;

public class MultiplicationOfPreviousAndNext {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        if (A.size() == 1)
            return A;
        ArrayList<Integer> output = new ArrayList<Integer>();
        output.add(A.get(0) * A.get(1));
        int lastIndex = A.size() - 1;
        for (int i = 1; i < lastIndex; i++) {
            output.add(A.get(i - 1) * A.get(i + 1));
        }

        output.add(A.get(lastIndex) * A.get(lastIndex - 1));
        return output;
    }
}
