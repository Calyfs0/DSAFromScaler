import java.util.Stack;

class Solution {
    Stack<Integer> stack;
    int min;
    Solution(){
        stack = new Stack<Integer>();
        min = Integer.MAX_VALUE;
    }
    public void push(int x) {
        if(stack.size() == 0){
            stack.push(x);
            min = x;
        }
        else if(x >= min){
            stack.push(x);
        }
        else{
            int val = (2 * x - min);
            stack.push(val);
            min = x;
        }

    }

    public void pop() {
        if(stack.size() > 0){
            int val = stack.pop();
            if(val < min){
                min = 2*min - val;
            }
        }
    }

    public int top() {
        if(stack.size() > 0){
            return Math.max(stack.peek(), min);
        }
        return -1;
    }

    public int getMin() {
        if(stack.size() == 0) return -1;

        return min;

    }
}