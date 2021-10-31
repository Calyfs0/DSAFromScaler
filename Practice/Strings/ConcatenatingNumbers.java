public class Solution {
    public int solve(int A, int B, int C) {
            String a = Integer.toString(A);
            String b = Integer.toString(B);
            String c = Integer.toString(C);
            
            if (A<=B && B<=C) return Integer.parseInt(a+b+c);
                
            else if (B<=A && A<=C) return Integer.parseInt(b + a + c);
                
            else if (C<=A && A<=B) return Integer.parseInt(c+a+b);
                
            else if (C<=B && B<=A) return Integer.parseInt(c+b+a);
                
            else if (A<=C && C<=B) return Integer.parseInt(a+c+b);
                
            else return Integer.parseInt(b+c+a);
                
            
    }
}
