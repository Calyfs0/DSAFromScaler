import java.util.ArrayList;

public class MultipleLeftRotation {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {

        ArrayList<ArrayList<Integer>> final_output = new ArrayList<>();


        for (Integer integer : B) {
            ArrayList<Integer> C = new ArrayList<>(A);
            int k = integer % A.size();

            int i = 0;
            int j = C.size() - 1;
            while (i < j) {
                C.set(i, C.get(i) ^ C.get(j));
                C.set(j, C.get(i) ^ C.get(j));
                C.set(i, C.get(i) ^ C.get(j));
                i++;
                j--;
            }


            i = 0;
            j = C.size() - k - 1;

            while (i < j) {
                C.set(i, C.get(i) ^ C.get(j));
                C.set(j, C.get(i) ^ C.get(j));
                C.set(i, C.get(i) ^ C.get(j));
                i++;
                j--;
            }


            i = C.size() - k;
            j = C.size() - 1;

            while (i < j) {
                C.set(i, C.get(i) ^ C.get(j));
                C.set(j, C.get(i) ^ C.get(j));
                C.set(i, C.get(i) ^ C.get(j));
                i++;
                j--;
            }

            final_output.add(C);
        }
        return final_output;
    }
}
