import java.util.Arrays;

public class PrimeSum {
    public int[] primesum(int A) {
        int val = A;

        // Creating a prime array
        int[] prime_array = new int[val + 1];
        Arrays.fill(prime_array, 1);
        prime_array[0] = 0;
        prime_array[1] = 0;

        for (int i = 2; i * i <= val; i++) {
            if (prime_array[i] == 1) {
                for (int j = i * i; j <= val; j += i) {
                    prime_array[j] = 0;
                }
            }
        }

        for (int k = 0; k < prime_array.length; k++) {
            if (prime_array[k] == 1) {
                int diff = A - k;
                if (prime_array[diff] == 1)
                    return new int[] { k, diff };
            }
        }

        return new int[] {};
    }
}
