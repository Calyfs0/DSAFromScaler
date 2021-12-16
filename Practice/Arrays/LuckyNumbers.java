import java.util.Arrays;

public class LuckyNumbers {
	public int solve(int A) {
		int[] prime_arr = new int[A + 1];
		int[] divisor_arr = new int[A + 1];

		Arrays.fill(prime_arr, 1);

		prime_arr[0] = 0;
		prime_arr[1] = 0;

		for (int i = 0; i * i <= A; i++) {

			if (prime_arr[i] == 1) {
				for (int j = i * i; j <= A; j += i) {
					prime_arr[j] = 0;
				}
			}
		}
		for (int i = 2; i <= A; i++) {

			if (prime_arr[i] == 1) {
				for (int j = i; j <= A; j += i) {
					divisor_arr[j] += 1;
				}
			}
		}
		int count = 0;
		for (int k = 0; k <= A; k++) {
			if (divisor_arr[k] == 2)
				count++;
		}
		return count;
	}
}
