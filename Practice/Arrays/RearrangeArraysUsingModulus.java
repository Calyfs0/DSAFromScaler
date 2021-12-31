import java.util.ArrayList;

public class RearrangeArraysUsingModulus {
    public void arrange(ArrayList<Integer> A) {

        int n = A.size();

        for (int i = 0; i < A.size(); i++) {
            A.set(i, A.get(i) * n);
        }

        for (int i = 0; i < A.size(); i++) {
            int index = A.get(i) / n;
            int val = A.get(index) / n;

            A.set(i, A.get(i) + val);
        }

        for (int i = 0; i < A.size(); i++) {
            A.set(i, A.get(i) % n);
        }

    }
}