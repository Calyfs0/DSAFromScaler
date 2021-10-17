class StrictlySmallerAndGreater {
    public static int SmallerAndGreater(int[] A) {

        int max = A[0];
        int min = A[0];
        int count = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            } else if (A[i] < min) {
                min = A[i];
            }
        }

        for (int i : A) {
            if (i < max && i > min) {
                count++;
            }
        }
        return count;
    }

}