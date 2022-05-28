public class SmallestXOR {
    public static void main(String[] args) {
        SmallestXOR smallestXOR = new SmallestXOR();
        int A = 4;
        int B = 6;
        System.out.println(smallestXOR.solve(A, B));
    }
    public int solve(int A, int B) {
        int ans = 0;

        for(int i=31;i>=0;i--){
            if((A & (1<<i)) > 0){
                ans |= 1<<i;
                B--;
            }
            if(B == 0) return ans;
        }

        for(int i = 0;i<31;i++){
            if((A & (1<<i)) == 0){
                ans |= 1<<i;
                B--;
            }
            if(B == 0) return ans;
        }

        return ans;
    }
}

