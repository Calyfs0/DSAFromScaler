public class Flip {
    public int[] flip(String A) {
        int curr_sum = 0;
        int max_sum = 0;
        int L = 1;
        int R = 1;
        int curr_left = 1;

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '0') {
                curr_sum += 1;
            } else {
                curr_sum -= 1;
            }
            if (curr_sum < 0) {
                curr_left = i + 2;

                curr_sum = 0;
            }

            if (max_sum < curr_sum) {
                max_sum = curr_sum;
                R = i + 1;
                L = curr_left;
            }
        }

        if (max_sum == 0)
            return new int[] {};
        return new int[] { L, R };

    }
}
