import java.util.ArrayList;
import java.util.List;
import java.util.Stack;;
public class SortStackUsingAnotherStack {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(5,4,3,2,1));
        SortStackUsingAnotherStack sortStackUsingAnotherStack = new SortStackUsingAnotherStack();
        sortStackUsingAnotherStack.solve(A);
    }
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        Stack<Integer> input = new Stack<Integer>();
        Stack<Integer> tempStack = new Stack<Integer>();

        for(int i=0;i<A.size();i++){
            input.push(A.get(i));
        }

        while(!input.isEmpty()){
            int val = input.pop();
            while(!tempStack.isEmpty() && tempStack.peek() > val){
                input.push(tempStack.pop());
            }
            tempStack.push(val);
        }

        ArrayList<Integer> output = new ArrayList<Integer>();

        for(int i=0;i<tempStack.size();i++){
            output.add(tempStack.get(i));
        }

        return output;
    }
}
