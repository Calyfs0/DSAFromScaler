public class FindFibonacciII {
    public int findAthFibonacci(int A) {
        if(A <=1) return A;

        return findAthFibonacci(A-1) + findAthFibonacci(A-2);
    }
}
