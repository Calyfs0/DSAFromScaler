public class SearchInBitonicArrayLinearSolution {
    public int solve(int[] A, int B) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == B)
                return i;
        }
        return -1;
    }
}
