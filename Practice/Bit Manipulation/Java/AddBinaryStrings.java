public class AddBinaryStrings {
    public String addBinary(String A, String B) {

        int i = A.length() - 1;
        int j = B.length() - 1;

        int L = Math.max(A.length(), B.length());
        int carry = 0;

        String final_output = "";
        for (int x = L - 1; x >= 0; x--) {
            int sum = 0;
            if (i >= 0) {
                sum += A.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += B.charAt(j) - '0';
                j--;
            }

            sum += carry;
            carry = sum / 2;
            int output = sum % 2;
            final_output = output + final_output;
        }

        if (carry == 1) {
            final_output = carry + final_output;
        }

        return final_output;
    }

}
