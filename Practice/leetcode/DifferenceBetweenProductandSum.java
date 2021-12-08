public class DifferenceBetweenProductandSum {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;

        while (n > 0) {
            int val = n % 10;
            sum += val;
            product *= val;
            n = n / 10;
        }

        return product - sum;

    }

}
