public class InterestingArray {
    public String solve(int[] A) {
        if (A.length == 1) {
            if (A[0] == 0)
                return "Yes";
            return "No";
        }
        int xor = 0;
        for (int i = 0; i < A.length; i++) {
            xor ^= A[i];
        }

        if (xor % 2 == 0)
            return "Yes";
        return "No";
    }
}
