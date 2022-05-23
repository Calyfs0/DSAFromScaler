import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayWithConsecutiveElements {
    public int solve(ArrayList<Integer> A) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < A.size(); i++) {
            int currentValue = A.get(i);

            if (currentValue > max) {
                max = currentValue;
            }
            if (currentValue < min) {
                min = currentValue;
            }
        }

        for (int i = 0; i < A.size(); i++) {
            int index = Math.abs(A.get(i)) - min;
            if (index < 0 || index > A.size() - 1 || A.get(index) < 0)
                return 0;
            A.set(index, A.get(index) * -1);
        }

        return 1;
    }

    public int solve2(ArrayList<Integer> A) {
        Collections.sort(A);

        for (int i = 1; i < A.size(); i++) {
            if (A.get(i) != A.get(i - 1) + 1)
                return 0;
        }
        return 1;
    }
}
