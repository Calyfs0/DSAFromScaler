public class Solution {
    public int pow(int A, int B, int C) {
        if (A== 0) return 0;
        if (B==0) return 1;
        
        long val = pow(A,B/2,C);
        if (B % 2 == 0){
            if ((val%C * val%C)%C < 0){
                return (int)(val%C * val%C)%C + C;
            }
            return (int)(val%C * val%C)%C;
        }
        else{
            if ((val%C * val%C * A%C)%C < 0){
                return (int)(val%C * val%C * A%C)%C + C;
            }
            return (int) (val%C * val%C * A%C)%C;
        }
    }
}
