import java.util.Arrays;

public class KthPriceUsingSorting {
    public int kthsmallest(final int[] A, int B) {
        int[] X = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            X[i] = A[i];
        }

        Arrays.sort(X);

        return X[B - 1];
    }
}
