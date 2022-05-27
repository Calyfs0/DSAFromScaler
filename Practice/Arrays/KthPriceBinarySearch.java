

public class KthPriceBinarySearch {
    public int kthsmallest(final int[] A, int B) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++) {
            if (A[i] < min)
                min = A[i];
            if (A[i] > max)
                max = A[i];
        }

        int mid = (min + max) / 2;

        while (min <= max) {
            int count = 0;
            for (int i = 0; i < A.length; i++) {
                if (A[i] <= mid) {
                    count++;
                }
            }

            if (count < B) {
                min = mid + 1;
            } else
                max = mid - 1;
            mid = (min + max) / 2;
        }

        return min;
    }
}
