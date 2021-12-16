public class CountOfDivisors {
    public int[] solve(int[] A) {
        int max = A[0];

        // Calculate max to initialize divisor array of max length
        for (int i = 1; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }

        int[] divisor_array = new int[max + 1];
        divisor_array[1] = 1; // Setting number of divisor of 1 as 1

        // Setting initial divisors as 2 as all numbers will have at least 2 divisors
        // i.e. 1 and itself
        for (int j = 2; j < divisor_array.length; j++) {
            divisor_array[j] = 2;
        }

        // incrementing the number of divisors for each multiples of numbers
        for (int k = 2; k < divisor_array.length; k++) {

            for (int l = k + k; l < divisor_array.length; l += k) {
                divisor_array[l] += 1;
            }
        }

        // Fetching the values of numbers in array directly from divisor_array into the
        // output array
        for (int c = 0; c < A.length; c++) {
            A[c] = divisor_array[A[c]];
        }

        return A;

    }
}
