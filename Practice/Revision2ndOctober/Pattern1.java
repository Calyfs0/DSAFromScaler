class Pattern1 {
    public static int[][] PrintPattern1() {
        int A = 3;
        int[][] output = new int[A][A];
        for (
                int i = 1;
                i <= A; i++) {
            for (int j = 1; j <= A; j++) {
                if (j <= i) {
                    output[i - 1][j - 1] = j;
                }
            }

        }

        return output;
    }
}
