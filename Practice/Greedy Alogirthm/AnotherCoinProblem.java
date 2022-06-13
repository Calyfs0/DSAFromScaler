public class AnotherCoinProblem{

    public static void main(String[] args) {
        AnotherCoinProblem anotherCoinProblem = new AnotherCoinProblem();
        System.out.println(anotherCoinProblem.solve(47));
        
    }
    public int solve(int A){
        int coins = 0;

        while(A>=5){
            int val = A%5;
            coins += val;
            A -= val;

            A /= 5;
        }

        coins += A;

        return coins;
    }
}