import java.util.ArrayList;
import java.util.List;

public class MinimizeTheAbsoluteDifference {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 4, 5, 8, 10));
        ArrayList<Integer> B = new ArrayList<>(List.of(6, 9, 15));
        ArrayList<Integer> C = new ArrayList<>(List.of(2, 3, 6, 6));
        System.out.println(solve(A, B, C));
    }

    public static int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        int i = 0, j = 0, k = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;
        while (i < A.size() && j < B.size() && k < C.size()) {
            int val1 = A.get(i);
            int val2 = B.get(j);
            int val3 = C.get(k);

            max = Math.max(val1, val2);
            max = Math.max(max, val3);

            min = Math.min(val1, val2);
            min = Math.min(min, val3);

            ans = Math.min(max - min, ans);

            if (min == val1) {
                i++;
            } else if (min == val2) {
                j++;
            }

            else
                k++;
        }

        return ans;
    }
}