import java.util.ArrayList;

public class ReverseTheArray {
    final ArrayList<Integer> A;

    public ReverseTheArray(ArrayList<Integer> A) {
        this.A = A;
    }

    public ArrayList<Integer> Reverse() {
        int i = 0;
        int j = A.size() - 1;

        while (i < j) {
            A.set(i, A.get(i) ^ A.get(j));
            A.set(j, A.get(i) ^ A.get(j));
            A.set(i, A.get(i) ^ A.get(j));
            i++;
            j--;
        }

        return A;
    }

}
