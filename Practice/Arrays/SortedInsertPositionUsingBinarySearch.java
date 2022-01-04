public class SortedInsertPositionUsingBinarySearch {
    public int searchInsert(int[] A, int B) {
        int l = 0;
        int r = A.length - 1;
        if (A[r] < B)
            return r + 1;
        if (A[l] >= B)
            return 0;
        int index = 0;
        int mid = (l + r) / 2;
        while (l <= r) {

            int curr_val = A[mid];
            if (curr_val == B) {
                return mid;
            } else if (curr_val > B) {
                r = mid - 1;
            } else {
                index = mid;
                l = mid + 1;
            }
            mid = (l + r) / 2;
        }
        return index + 1;

    }
}
