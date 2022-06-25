
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int[] fibArray = new int[A + 1];
        for (int i = 0; i < fibArray.length; i++) {
            fibArray[i] = -1;
        }
        FibonacciSeries main = new FibonacciSeries();
        int fibNumber = main.fib(A, fibArray);
        System.out.println(fibNumber);
        sc.close();

    }

    public int fib(int A, int[] fibArray) {
        if (A == 0 || A == 1)
            return A;

        if (fibArray[A] != -1)
            return fibArray[A];

        fibArray[A] = fib(A - 1, fibArray) + fib(A - 2, fibArray);
        return fibArray[A];
    }
}
