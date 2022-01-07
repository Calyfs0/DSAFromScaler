public class MatrixMedianBinarySearch {
    public int findMedian(int[][] A) {
        int N = A.length;
        int M = A[0].length;
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            if (A[i][0] < low) {
                low = A[i][0];
            }
            if (A[i][M - 1] > high) {
                high = A[i][M - 1];
            }
        }

        int mid = (low + high) / 2;
        int output_index = (1 + N * M) / 2;
        while (low <= high) {
            // Apply binary search in every row and calculate number of values less than mid
            int count = 0;
            for (int i = 0; i < N; i++) {
                count += CalculateLessValues(A, i, mid);
            }

            if (count >= output_index) {
                high = mid - 1;
            } else {

                low = mid + 1;
            }

            mid = (low + high) / 2;
        }

        return low;
    }

    public int CalculateLessValues(int[][] A, int row, int val) {
        int l = 0;
        int r = A[0].length - 1;
        int mid = (l + r) / 2;

        while (l <= r) {
            if (A[row][mid] <= val) {
                l = mid + 1;
            } else
                r = mid - 1;
            mid = (l + r) / 2;
        }

        return l;
    }
}
