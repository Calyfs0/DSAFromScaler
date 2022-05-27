public class ReverseBits {
    public static void main(String[] args) {
        ReverseBits reverseBits = new ReverseBits();
        long A = 3;
        System.out.println(reverseBits.reverse(A));
    }
    public long reverse(long a) {
        long reverseInt = 0;

        for(int i=0;i<32;i++){
            if((a & (1<<i)) > 0){
                reverseInt |= (long)1<<(31-i);
            }
            
        }

        return reverseInt;
	}
}
