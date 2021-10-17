class TwoGreaterElement {
    public static int[] TwoGreaterElements(int[] A) {

        int L = A.length;
        int[] output = new int[L - 2];

        int first_max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;

        for (int value : A) {
            if (value > first_max) {
                second_max = first_max;
                first_max = value;
            } else if (value > second_max) {
                second_max = value;
            }
        }
        int j = 0;
        for (int k : A) {
            if (k < second_max) {
                output[j] = k;
                j++;
            }
        }
        return output;
    }
}