import java.util.Stack;

public class EvaluateExpression {
    public static void main(String[] args) {
        String[] A = {"2", "2", "/" };
        EvaluateExpression evaluateExpression = new EvaluateExpression();
        System.out.println(evaluateExpression.evalRPN(A));
    }
    public int evalRPN(String[] A) {
        Stack<String> s = new Stack<String>();
        for(int i=0;i<A.length;i++){
            String currentValue = A[i];

            if(currentValue.equals("+") || currentValue.equals("-") || currentValue.equals("*") || currentValue.equals("/")){
                int val1 = Integer.parseInt(s.pop());
                int val2 = Integer.parseInt(s.pop());
                int output = 0;
                switch(currentValue){
                    case "+":
                        output = val2 + val1;
                        break;
                    case "-":
                        output = val2 - val1;
                        break;
                    case "*":
                        output = val2 * val1;
                        break;
                    case "/":
                        output = val2/val1;
                        break;

                }

                s.push(Integer.toString(output));
            }
            else{
                s.push(A[i]);
            }
        }

        return Integer.parseInt(s.pop());
    }
}
