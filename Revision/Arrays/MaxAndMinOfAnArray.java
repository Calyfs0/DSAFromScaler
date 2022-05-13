public class MaxAndMinOfAnArray {

    public void PrintMaxAndMin(int[] inputArray) {
        int maxElement = Integer.MIN_VALUE;
        int minElement = Integer.MAX_VALUE;

        for (int i = 0; i < inputArray.length; i++) {
            if (maxElement < inputArray[i]) {
                maxElement = inputArray[i];
            }

            if (minElement > inputArray[i]) {
                minElement = inputArray[i];
            }

        }
        System.out.print(maxElement + " " + minElement);
    }

}
