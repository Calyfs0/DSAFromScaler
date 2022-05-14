import java.util.ArrayList;

public class PrimalPower {
    public int solve(ArrayList<Integer> A) {
        int primalPower = 0;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) <= 1)
                continue;
            if (isPrime(A.get(i)))
                primalPower++;
        }

        return primalPower;
    }

    public boolean isPrime(int n) {

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public int solveUsingPrimeArray(ArrayList<Integer> A) {
        int primalPower = 0;
        int maxValue = 0;

        for (int i = 0; i < A.size(); i++) {
            maxValue = Math.max(maxValue, A.get(i));
        }

        int[] primeArray = new int[maxValue + 1];
        primeArray[0] = 1;
        primeArray[1] = 1;

        for (int i = 2; i < primeArray.length; i++) {
            if (primeArray[i] == 0) {
                for (int j = i + i; j < primeArray.length; j = j + i) {
                    primeArray[j] = 1;
                }
            }
        }

        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) < 0)
                continue;
            if (primeArray[A.get(i)] == 0) {
                primalPower++;
            }
        }

        return primalPower;
    }
}
