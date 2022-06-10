import java.util.Stack;

public class DoubleCharacterTrouble {
    public String solve(String A) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < A.length(); i++) {
            char currentValue = A.charAt(i);
            if (!stack.isEmpty() && stack.peek() == currentValue) {
                stack.pop();
            } else {
                stack.push(currentValue);
            }
        }
        StringBuilder output = new StringBuilder();
        while (!stack.isEmpty()) {
            output.insert(0, stack.pop());
        }

        return output.toString();
    }
}