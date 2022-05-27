public class AddBinaryStrings {
    public static void main(String[] args) {
        String A = "100";
        String B = "11";
        AddBinaryStrings abs = new AddBinaryStrings();
        System.out.println(abs.addBinary(A, B));
    }
    public String addBinary(String A, String B) {
        String final_output = "";

        int i = A.length() -1;
        int j = B.length() - 1;

        int maxLength = Math.max(i,j);
        int carry = 0;
        for(int x = 0;x<=maxLength;x++){
            int ans = 0;
            
            if(i>=0){
                ans += A.charAt(i) - '0';
                i--;
            }

            if(j>=0){
                ans += B.charAt(j) - '0';
                j--;
            }

            ans += carry;
            carry = ans/2;
            final_output = Integer.toString(ans) + final_output;
            
        }

        return final_output;
    }

}
