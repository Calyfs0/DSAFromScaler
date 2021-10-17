class MaxEvenMinOddDiff {
    public static int DiffBetweenEvenAndOdd() {
        int[] A = {0, 2, 9};
        int even_max = Integer.MIN_VALUE;
        int odd_min = Integer.MAX_VALUE;

        for (int i : A) {
            if (i % 2 == 0) {
                if (i > even_max) {
                    even_max = i;
                }
            } else if (i % 2 != 0) {
                if (i < odd_min) {
                    odd_min = i;
                }
            }
        }

        return even_max - odd_min;
    }
}