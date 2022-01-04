public class PeakElementUsingBinarySearch {
    public int solve(int[] A) {
        int n = A.length;
        if (n == 1)
            return A[0];
        if (A[0] > A[1])
            return A[0];
        if (A[n - 1] > A[n - 2])
            return A[n - 1];

        int l = 0;
        int r = A.length - 1;
        int mid = (l + r) / 2;
        while (l <= r) {
            int curr_value = A[mid];
            if (curr_value > A[mid - 1] && curr_value > A[mid + 1]) {
                return curr_value;
            } else if (A[mid - 1] > curr_value)
                r = mid - 1;
            else
                l = mid + 1;
            mid = (l + r) / 2;
        }

        return A[mid];
    }
}
