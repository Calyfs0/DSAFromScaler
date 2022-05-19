import java.util.ArrayList;
import java.util.List;

public class ArrayThreePointers {

    public static void main(String[] args) {

        List<Integer> A = new ArrayList<>(List.of(1, 4, 10));
        List<Integer> B = new ArrayList<>(List.of(2, 15, 20));
        List<Integer> C = new ArrayList<>(List.of(10, 12));
        System.out.println(solve(A, B, C));

    }

    public static int solve(final List<Integer> A, final List<Integer> B, final List<Integer> C) {
        int ans = Integer.MAX_VALUE;
        int i = 0, j = 0, k = 0;
        int max = 0;

        while (true) {
            int firstValue = A.get(i);
            int secondValue = B.get(j);
            int thirdValue = C.get(k);
            int val1 = Math.abs(firstValue - secondValue);
            int val2 = Math.abs(secondValue - thirdValue);
            int val3 = Math.abs(thirdValue - firstValue);
            max = Math.max(val1, val2);
            max = Math.max(max, val3);
            ans = Math.min(max, ans);

            // Condition 1: when val1 is max

            if (max == val1) {
                if (firstValue < secondValue) {
                    i++;

                } else {
                    j++;
                }
                if (j == B.size() || i == A.size())
                    return ans;
            }

            // Condition 2: when val2 is max
            else if (max == val2) {
                if (secondValue < thirdValue) {
                    j++;

                } else {
                    k++;
                }
                if (j == B.size() || k == C.size())
                    return ans;
                // Condition 3: when val3 is max
            } else if (thirdValue < firstValue) {
                k++;

            } else {
                i++;

            }
            if (k == C.size() || i == A.size())
                return ans;

        }
    }
}