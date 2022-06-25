public class MaxSumWithoutAdjacentElements {
    public static void main(String[] args) {
        MaxSumWithoutAdjacentElements maxSumWithoutAdjacentElements = new MaxSumWithoutAdjacentElements();
        int[][] A = { { 74, 37, 82, 1 }, { 66, 38, 16, 1 } };
        System.out.println(maxSumWithoutAdjacentElements.adjacent(A));
    }

    public int adjacent(int[][] A) {
        int length = A[0].length;
        int[] dp = new int[length];
        int[] inputArray = new int[length];

        for (int i = 0; i < length; i++) {
            inputArray[i] = Math.max(A[0][i], A[1][i]);
        }

        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        int val = solve(inputArray, dp, 0, length);
        return val;

    }

    public int solve(int[] A, int[] dp, int index, int maxLength) {
        if (index == maxLength - 2) {
            return Math.max(A[index], A[index + 1]);
        }
        if (index == maxLength - 1)
            return A[index];

        if (dp[index] != -1)
            return dp[index];
        int sum = 0;
        dp[index] = Math.max(solve(A, dp, index + 1, maxLength), solve(A, dp, index + 2, maxLength) + A[index]);
        return dp[index];
    }
}
