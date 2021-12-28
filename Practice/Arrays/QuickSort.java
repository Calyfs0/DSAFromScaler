public class QuickSort {
    public int[] solve(int[] A) {

        quicksort(A, 0, A.length - 1);
        return A;

    }

    public void quicksort(int[] A, int l, int r) {

        if (l >= r)
            return;
        int ind = rearrange(A, l, r);
        quicksort(A, l, ind - 1);
        quicksort(A, ind + 1, r);
    }

    public int rearrange(int[] A, int l, int r) {
        int p1 = l + 1;
        int p2 = r;

        while (p1 <= p2) {
            if (A[p1] <= A[l]) {
                p1++;
            } else if (A[p2] > A[l]) {
                p2--;
            } else {
                swap(A, p1, p2);
                p1++;
                p2--;
            }
        }
        swap(A, l, p1 - 1);
        return p1 - 1;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
