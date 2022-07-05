import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FibonacciSeries {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int input = Integer.parseInt(bReader.readLine());
            int[] memArray = new int[input + 1];
            Arrays.fill(memArray, -1);
            FibonacciSeries fibonacciSeries = new FibonacciSeries();
            System.out.println(fibonacciSeries.FindFibonacciNumber(input, memArray));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private int FindFibonacciNumber(int num, int[] memArray) {
        if (num < 2)
            return num;

        if (memArray[num] != -1)
            return memArray[num];
        memArray[num] = FindFibonacciNumber(num - 1, memArray) + FindFibonacciNumber(num - 2, memArray);
        return memArray[num];
    }

}
