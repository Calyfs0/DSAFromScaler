public class StrangeEquality {
    public static void main(String[] args) {
        int A = 5;
        StrangeEquality strangeEquality = new StrangeEquality();
        System.out.println(strangeEquality.solve(A));
    }

    public int solve(int A) {
        int smallNumber = 0;
        int largeNumber = 0;
        int i = 0;
        while(A>0){
            if((A &(1<<0)) == 0){
                smallNumber |= 1<<i;
            }
            i++;
            A = A>>1;
        }

        largeNumber |= 1<<(i);
        return smallNumber^largeNumber;
    }
    
}
