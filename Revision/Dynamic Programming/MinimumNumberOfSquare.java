public class MinimumNumberOfSquare {
    public int countMinSquares(int A) {
        int[] minimumCountArray = new int[A + 1];
        for (int i = 0; i < minimumCountArray.length; i++) {
            minimumCountArray[i] = -1;
        }
        return minimumCount(A, minimumCountArray);
    }

    public int minimumCount(int A, int[] minimumCountArray) {

        if (A == 0)
            return 0;
        if (minimumCountArray[A] != -1)
            return minimumCountArray[A];
        minimumCountArray[A] = 1;
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i * i <= A; i++) {
            ans = Math.min(ans, minimumCount(A - i * i, minimumCountArray));
        }
        minimumCountArray[A] += ans;
        return minimumCountArray[A];

    }

}
