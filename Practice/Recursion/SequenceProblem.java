public class Solution {
    public int solve(int A) {
        if(A<=1) return 1;
        
        if(A == 2) return 2;
        
        return solve(A-1) + solve(A-2) + solve(A-3) + A;
    }
}
