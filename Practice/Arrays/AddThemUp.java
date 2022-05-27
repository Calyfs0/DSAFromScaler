import java.util.ArrayList;
public class AddThemUp{
    public static void main(String[] args) {
        int A = 30;
        ArrayList<Integer> output = AddThemUp.solve(A);
        System.out.println(output.toString());

    }
    public static ArrayList<Integer> solve(int A) {
        ArrayList<Integer> output = new ArrayList<Integer>();

        for(int i=1;i<A;i++){
            int digitSum = 0;
            int numValue = i;
            while(numValue > 0){
                digitSum += numValue%10;
                numValue = numValue/10;
            }

            if((digitSum + i) == A){
                output.add(i);
            }
        }
        if(output.size() == 0){
            output.add(-1);
        };
        return output;
    }
}