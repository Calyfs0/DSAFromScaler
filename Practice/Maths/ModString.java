public class ModString {
    public int findMod(String A, int B) {
        int ans = 0;
        long pow = 1;
        long result = 0;
        for(int i=A.length()-1;i>=0;i--){
            result = (Integer.parseInt(A.substring(i, i+1))%B * pow%B)%B;
            ans = (ans%B+(int)result%B)%B;
            pow = (pow%B*10%B)%B;
        }
        
        return ans;
    }
}
