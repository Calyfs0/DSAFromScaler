import java.util.ArrayList;

public class FizzBuzz {

    public static ArrayList<String> FizzBuzzArray(int A) {
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 1; i <= A; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                arr.add("FizzBuzz");
            } else if (i % 3 == 0) {
                arr.add("Fizz");
            } else if (i % 5 == 0) {
                arr.add("Buzz");
            } else {
                arr.add(Integer.toString(i));
            }
        }
        return arr;
    }
}