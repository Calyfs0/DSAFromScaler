public class SearchInSortedRowAndColumns {
    public int solve(int[][] A, int B) {
        int N = A.length;
        int M = A[0].length;

        int i = 0;
        int j = M - 1;
        int ans = Integer.MAX_VALUE;
        while (i < N && j >= 0) {
            int val = A[i][j];
            if (val == B) {
                int val1 = ((i + 1) * 1009 + (j + 1));
                ans = Math.min(val1, ans);
                j--;
            }
            if (B > val)
                i++;
            else if (B < val)
                j--;
        }

        if (ans == Integer.MAX_VALUE)
            return -1;
        return ans;

    }

}
