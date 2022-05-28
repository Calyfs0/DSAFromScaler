public class DivideInteger {
    public static void main(String[] args) {
        int A = 7;
        int B = 1;
        DivideInteger divideInteger = new DivideInteger();
        System.out.println(divideInteger.divide(A, B));
    }

    public int divide(int A, int B) {
        long ans = 0;
        int multiplier = 1;

        if(A < 0){
            multiplier *= -1;
        }
        if(B < 0){
            multiplier *= -1;
        }

        long a = Math.abs((long)A);
        long b = Math.abs((long)B);

        for(int i=31;i>=0;i--){
            int val = (int)Math.pow(2,i);
            long divisor = b * val;
            if(divisor <= a){
                a -= divisor;
                ans += val;
            }
        }
        ans *= multiplier;
        if(ans > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;

        }
        return (int)ans;
    }
    
}
