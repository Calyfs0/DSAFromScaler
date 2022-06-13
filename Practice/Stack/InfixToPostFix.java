import java.util.HashMap;
import java.util.Stack;
public class InfixToPostFix{
    public static void main(String[] args) {
        String s = "a*(r+o*h)";
        System.out.println(solve(s));
    }

    public static String solve(String A){

        String output = "";
        Stack<String> operatorStack = new Stack<>();
        HashMap<String,Integer> precendenceMap = new HashMap<>();
        precendenceMap.put("^",3);
        precendenceMap.put("*",2);
        precendenceMap.put("/",2);
        precendenceMap.put("+",1);
        precendenceMap.put("-",1);

        for(int i=0;i<A.length();i++){
            String currentValue = Character.toString(A.charAt(i));

            switch(currentValue){
                case "^":
                case "*":
                case "/":
                case "+":
                case "-":
                    while(!operatorStack.isEmpty() && !operatorStack.peek().equals("(") && precendenceMap.get(operatorStack.peek()) >= precendenceMap.get(currentValue) ){
                        output += operatorStack.pop();
                    }
                    operatorStack.push(currentValue);
                    break;
                case "(":
                    operatorStack.push("(");
                    break;
                case ")":
                    while(!operatorStack.peek().equals("(")){
                        output += operatorStack.pop();
                    }
                    operatorStack.pop();
                    break;
                default:
                    output += currentValue;

            }
        }
        while(!operatorStack.isEmpty()){
            output += operatorStack.pop();
        }
        return output;
    }
}

// abcd^e-fgh*+^*+i-
// abcd^e-fgh*+^*i-+

//a
//bcd^e-fgh*+^*i-


//+
