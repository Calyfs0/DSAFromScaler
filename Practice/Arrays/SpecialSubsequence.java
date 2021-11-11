public class SpecialSubsequence {
    public int solve(String A) {
        int gCount = 0;
        int output = 0;

        for(int i=A.length() -1;i>=0;i--){
            if(A.charAt(i) == 'G'){
                gCount += 1;
            }
            else{
                if(A.charAt(i) == 'A'){
                    output += gCount;
                }
            }
        }

        return output%1000000007;

    }
    
}
