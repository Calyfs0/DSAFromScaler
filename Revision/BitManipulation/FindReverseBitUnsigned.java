public class FindReverseBitUnsigned{

    public static void main(String[] args) {
        int A = 3;
        System.out.println(FindReverseBitUnsigned.FindReverse(A));
    }

    public static long FindReverse(int A){
        long reverse = 0;

        for(int i=0;i<32;i++){
            if(A*(1<<i) > 0){
                reverse += (long)1 << (31-i);
            }
        }

        return reverse;
    }
}