public class InversionCountInAnArray {
    public int solve(int[] A) {
        return (int) MergeSort(A, 0, A.length - 1);
    }

    public long MergeSort(int[] A, int s, int e) {

        if (s == e)
            return 0;

        long mid = ((long) s + e) / 2;
        long x = MergeSort(A, s, (int) mid);
        long y = MergeSort(A, (int) mid + 1, e);

        long z = Merge(A, s, (int) mid + 1, e);

        return (x + y + z) % 1000000007;
    }

    public long Merge(int[] A, int s, int mid, int e) {
        int p1 = s;
        int p2 = mid;
        int p3 = 0;
        long count = 0;
        int[] temp = new int[e - s + 1];

        while (p1 < mid && p2 <= e) {
            if (A[p1] <= A[p2]) {
                temp[p3++] = A[p1++];
            } else {
                temp[p3++] = A[p2++];
                count += (long) mid - p1;
            }
        }

        while (p1 < mid) {
            temp[p3++] = A[p1++];
        }
        while (p2 <= e) {
            temp[p3++] = A[p2++];
        }

        for (int i = 0; i < temp.length; i++) {
            A[s + i] = temp[i];
        }
        return count;
    }
}