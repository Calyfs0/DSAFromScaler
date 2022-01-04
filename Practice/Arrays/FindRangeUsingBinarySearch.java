public class FindRangeUsingBinarySearch {
    public int[] searchRange(final int[] A, int B) {
        int minRange = -1;
        int maxRange = -1;

        minRange = minRange(A, B);
        maxRange = maxRange(A, B);

        return new int[] { minRange, maxRange };
    }

    public int minRange(int[] A, int B) {

        long l = 0;
        long r = A.length - 1;

        int curr_value = 0;
        long index = -1;

        while (l <= r) {
            long mid = (l + r) / 2;
            curr_value = A[(int) mid];
            if (curr_value == B) {
                index = mid;
                r = mid - 1;
            } else if (curr_value > B) {
                r = mid - 1;
            } else
                l = mid + 1;
            mid = (l + r) / 2;
        }

        return (int) index;

    }

    public int maxRange(int[] A, int B) {
        long l = 0;
        long r = A.length - 1;

        int curr_value = 0;
        long index = -1;
        while (l <= r) {
            long mid = (l + r) / 2;
            curr_value = A[(int) mid];
            if (curr_value == B) {
                index = mid;
                l = mid + 1;
            } else if (curr_value > B) {
                r = mid - 1;
            } else
                l = mid + 1;
        }

        return (int) index;

    }
}
