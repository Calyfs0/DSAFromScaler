import java.util.ArrayList;
import java.util.Stack;

public class PassingGame {
    public int solve(int A, int B, ArrayList<Integer> C) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(B);
        for(int i=0;i<A;i++){
            Integer currentValue = C.get(i);
            if(currentValue == 0 && !stack.isEmpty()){
                stack.pop();
            }
            else{
                stack.push(currentValue);
            }
        }

        return stack.peek();
    }
}
