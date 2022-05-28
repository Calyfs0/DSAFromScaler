public class SumOfDigits {

    public int solve(int A) {
        if(A == 0) return 0;

        return solve(A/10) + A%10;
    }
    
}
