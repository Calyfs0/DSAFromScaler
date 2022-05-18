import java.util.Scanner;

public class EvenOddElements {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int noOfQueries = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < noOfQueries; i++) {
            int even = 0;
            int odd = 0;
            int arrayLength = sc.nextInt();
            while (arrayLength-- > 0) {
                int val = sc.nextInt();
                if (val % 2 == 0)
                    even++;
                else
                    odd++;
            }
            sc.close();
            System.out.println(Math.abs(even - odd));

        }
    }
}
