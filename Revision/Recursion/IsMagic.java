public class IsMagic {
    public int solve(int A) {

        while(A> 9){
           A = IsMagic(A);
        }

        if(A == 1) return 1;
        return 0;
    }

    public int IsMagic(int A){
        if(A == 0) return 0;

        return IsMagic(A/10) + A%10;
    }
}
