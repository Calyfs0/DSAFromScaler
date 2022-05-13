import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class NobleInteger {
    ArrayList<Integer> A;

    public NobleInteger(ArrayList<Integer> A) {
        this.A = A;
    }

    public int FindNumberOfNobleIntegers() {
        Collections.sort(A);
        int prevValue = A.get(A.size() - 1);
        if (prevValue == 0) {
            return 1;
        }
        int largerElements = 0;
        for (int i = A.size() - 2; i >= 0; i--) {
            int currentValue = A.get(i);
            if (currentValue != prevValue) {
                largerElements = A.size() - 1 - i;
            }
            if (currentValue == largerElements)
                return 1;

            prevValue = currentValue;
        }

        return -1;
    }
}
