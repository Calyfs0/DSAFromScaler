import java.util.ArrayList;
import java.util.List;
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

        // --------------------------------------------------

        /// Rotation Game

        // RotationGame rg = new RotationGame(inputArray, B);
        // rg.RotateArray();

        // ---------------------------------------------------

        /// Max and min in an array

        // MaxAndMinOfAnArray mm = new MaxAndMinOfAnArray();
        // int[] A = { 1, 2, 3, 4, 5 };
        // mm.PrintMaxAndMin(A);

        // --------------------------------------------------

        /// Rock paper scissor game for seeing basic threads

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number of rounds: ");
        // int noOfRounds = sc.nextInt();
        // sc.nextLine();
        // System.out.println("Enter player1 name: ");
        // String playerOne = sc.nextLine();
        // System.out.println("Enter player2 name: ");
        // String playerTwo = sc.nextLine();

        // RockPaperScissor rps = new RockPaperScissor(noOfRounds, playerOne,
        // playerTwo);
        // rps.RandomAutoRockPaperScissorGame();
        // sc.close();

        // --------------------------------------------------

        /// Leaders in an array

        // ArrayList<Integer> inputArray = new ArrayList<Integer>(List.of(16, 17, 4, 3,
        // 5, 2));
        // LeadersInAnArray l = new LeadersInAnArray(inputArray);
        // ArrayList<Integer> outputArray = l.FindLeadersInArray();

        // System.out.println(outputArray.toString());

        // --------------------------------------------------

        /// Max Contiguous Sum in array

        // List<Integer> inputList = new ArrayList<Integer>(List.of(-2, 1, -3, 4, -1, 2,
        // 1, -5, 4));
        // MaxSumContiguousArray ms = new MaxSumContiguousArray(inputList);
        // int maxSum = ms.CalculateMaxContiguousSum();

        // System.out.println(maxSum);

        // --------------------------------------------------

        /// Multiple Left Rotations Of Array

        // ArrayList<Integer> A = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        // ArrayList<Integer> B = new ArrayList<>(List.of(2, 3));

        // MultipleLeftRotationsOfArray MRA = new MultipleLeftRotationsOfArray(A, B);
        // ArrayList<ArrayList<Integer>> output = MRA.DoRotations();

        // for (ArrayList<Integer> arrayList : output) {
        // System.out.println(arrayList.toString());
        // }

        // --------------------------------------------------

        /// Noble Integer

        // ArrayList<Integer> A = new ArrayList<>(List.of(3, 2, 1, 3));
        // NobleInteger ni = new NobleInteger(A);
        // System.out.println(ni.FindNumberOfNobleIntegers());

        // --------------------------------------------------

        /// Reverse the array

        // ArrayList<Integer> A = new ArrayList<>(List.of(3, 2, 1, 3));
        // ReverseTheArray RTA = new ReverseTheArray(A);
        // ArrayList<Integer> output = RTA.Reverse();
        // System.out.println(output.toString());

        // --------------------------------------------------

        /// SubArray with least average
        // ArrayList<Integer> A = new ArrayList<>(List.of(3, 7, 5, 20, -10, 0, 12));
        // int B = 3;
        // SubArrayWithLeastAverage subArrayWithLeastAverage = new
        /// SubArrayWithLeastAverage(A, B);
        // System.out.println(subArrayWithLeastAverage.GetFirstIndexOofLeastAverageSubArray());

        // --------------------------------------------------

        /// MAX MIN

        // ArrayList<Integer> A = new ArrayList<>(
        // List.of(34, 7, 96, 37, 12, 13, 22, 86, 17, 78, 95, 61, 42, 1, 42, 58, 98, 78,
        // 92, 85, 10, 97));
        // int B = 22;
        // MAXMIN mm = new MAXMIN();
        // System.out.println(mm.solve(A, B));

        // --------------------------------------------------

        /// Max min with minimum comparison

        MaxMinWithMinimumComparison mmwm = new MaxMinWithMinimumComparison();
        System.out.println(mmwm.solve());

    }

}
