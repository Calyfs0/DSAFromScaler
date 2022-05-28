public class NumberofOneBits {

    public static void main(String[] args) {
        int A = 2;
        NumberofOneBits nob = new NumberofOneBits();
        System.out.println(nob.numSetBits(A));
    }

    public int numSetBits(int A) {
        int noOfSetBits = 0;

        while(A>0){
            noOfSetBits++;
            A = A &(A-1);
        }

        return noOfSetBits;

    }
    
}
