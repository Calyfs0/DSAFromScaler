import java.util.ArrayList;

public class LeaderInArray {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> output = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {

            boolean isLeader = true;
            for (int j = i; j < A.size(); j++) {

                if (A.get(j) > A.get(i)) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                output.add(A.get(i));
            }
        }
        return output;
    }
}
