public class Solution {
    public int TrailingZeroes(int n) {
        int ans = 0;
        while(n >=5){
            n = n/5;
            ans += n;
        }
        
        return ans;
        
    }
}