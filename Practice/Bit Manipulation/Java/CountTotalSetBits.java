public class CountTotalSetBits {
    public static void main(String[] args) {
        int A = 4;
        CountTotalSetBits countTotalSetBits = new CountTotalSetBits();

        System.out.println(countTotalSetBits.TotalSetBits(A));
    }

    public int TotalSetBits(int A){
        if(A == 0) return 0;
        int pow = -1;
        int X = A;
        while(X>0){
            pow++;
            X = X>>1;
        }

        int val = (int)Math.pow(2,pow);
        long totalSetBits = (long)(val/2)*pow + (A-val+1) + TotalSetBits(A-val);
        return (int)(totalSetBits%1000000007);
    }
    
}
