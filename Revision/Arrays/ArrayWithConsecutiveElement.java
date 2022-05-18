
import java.util.ArrayList;

public class ArrayWithConsecutiveElement {
    ArrayList<Integer> A;

    public ArrayWithConsecutiveElement(ArrayList<Integer> A) {
        this.A = A;
    }

    public int Check() {
        int max = A.get(0);
        int min = A.get(0);

        for (int i = 1; i < A.size(); i++) {
            int currentValue = A.get(i);
            if (max < currentValue) {
                max = currentValue;
            } else if (min > currentValue) {
                min = currentValue;
            }
        }

        if ((max - min) >= A.size())
            return 0;

        for (int i = 0; i < A.size(); i++) {
            int index = Math.abs(A.get(i)) - min;
            if (index < 0 || index > (A.size() - 1) || A.get(index) < 0)
                return 0;

            A.set(index, A.get(index) * -1);

        }

        return 1;

    }
}
