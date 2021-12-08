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

    // Optimized approach using string
    public int subtractProductAndSumUsingString(int n) {
        String s = Integer.toString(n);
        char[] arr = s.toCharArray();
        int sum = 0;
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            int val = Character.getNumericValue(arr[i]);
            sum += val;
            product *= val;
        }

        return product - sum;

    }

}
