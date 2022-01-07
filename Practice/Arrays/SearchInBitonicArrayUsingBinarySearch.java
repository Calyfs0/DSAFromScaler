public class SearchInBitonicArrayUsingBinarySearch {
    public int solve(int[] A, int B) {
        int bitonic_point = FindBitonicPoint(A);
        int leftVal = SearchOnLeftSide(A, 0, bitonic_point - 1, B);
        int rightVal = SearchOnRightSide(A, bitonic_point, A.length - 1, B);
        return Math.max(leftVal, rightVal);
    }

    public int FindBitonicPoint(int[] A) {
        int l = 0;
        int r = A.length - 1;
        int mid = (l + r) / 2;

        while (l <= r) {
            if (A[mid - 1] < A[mid] && A[mid] > A[mid + 1]) {
                return mid;
            } else if (A[mid - 1] < A[mid] && A[mid] < A[mid + 1]) {
                l = mid + 1;
            } else
                r = mid - 1;
            mid = (l + r) / 2;
        }

        return l;
    }

    public int SearchOnLeftSide(int[] A, int l, int r, int B) {
        int ans = -1;
        int mid = (l + r) / 2;
        while (l <= r) {
            if (A[mid] == B)
                return mid;
            if (A[mid] > B) {
                r = mid - 1;
            } else
                l = mid + 1;
            mid = (l + r) / 2;
        }

        return ans;
    }

    public int SearchOnRightSide(int[] A, int l, int r, int B) {
        int ans = -1;
        int mid = (l + r) / 2;
        while (l <= r) {
            if (A[mid] == B)
                return mid;
            if (A[mid] > B) {
                l = mid + 1;
            } else
                r = mid - 1;
            mid = (l + r) / 2;
        }

        return ans;
    }
}
