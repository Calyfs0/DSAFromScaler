public class IsMagic {
    public int solve(int A) {

        while (A > 9) {
            A = sumOfDigits(A);
        }

        if (A == 1)
            return 1;
        return 0;
    }

    public int sumOfDigits(int N) {
        if (N == 0)
            return 0;

        return sumOfDigits(N / 10) + N % 10;

    }
}
