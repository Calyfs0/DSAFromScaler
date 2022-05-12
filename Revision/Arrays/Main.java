import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String[] arr = sc.nextLine().split(" ");
        // int arrayLength = Integer.parseInt(arr[0]);
        // int[] inputArray = new int[arrayLength];

        // for (int i = 0; i < arrayLength; i++) {
        // inputArray[i] = Integer.parseInt(arr[i + 1]);
        // }
        // int B = sc.nextInt();
        // sc.close();
        int[] inputArray = { 1, 2, 3, 4 };
        int B = 2;
        RotationGame rg = new RotationGame(inputArray, B);
        rg.RotateArray();
    }

}
