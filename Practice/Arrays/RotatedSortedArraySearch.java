public class RotatedSortedArraySearch {
    public int search(final int[] A, int B) {
        int l = 0;
        int r = A.length - 1;
        int mid = (l + r) / 2;

        while (l <= r) {
            if (A[mid] == B)
                return mid;
            if (A[mid] >= A[0]) {
                if (A[0] <= B && B < A[mid]) {
                    r = mid - 1;
                } else
                    l = mid + 1;
            } else if (B < A[mid])
                r = mid - 1;
            else
                l = mid + 1;

            mid = (l + r) / 2;
        }

        return -1;
    }
}
