import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Using sort method
// public class KthSmallestElement {
//     public int kthsmallest(final List<Integer> A, int B) {
//         Collections.sort((A));
//         return A.get(B - 1);
//     }
// }

//Without using sort method (Using selection sort)
public class KthSmallestElement {
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>(List.of(2, 1, 4, 3, 2));
        int B = 3;
        System.out.println(KthSmallestElement.kthsmallest(A, B));

    }

    public static int kthsmallest(final List<Integer> A, int B) {
        int bthMinimum = Integer.MAX_VALUE;
        for (int i = 0; i < A.size(); i++) {
            int currentMinimum = Integer.MAX_VALUE;
            int index = 0;

            for (int j = i; j < A.size(); j++) {
                if (currentMinimum > A.get(j)) {
                    currentMinimum = A.get(j);
                    index = j;
                }
            }
            int temp = A.get(i);
            A.set(i, currentMinimum);
            A.set(index, temp);
            B--;
            bthMinimum = currentMinimum;
            if (B == 0)
                return currentMinimum;
        }
        return bthMinimum;
    }
}
