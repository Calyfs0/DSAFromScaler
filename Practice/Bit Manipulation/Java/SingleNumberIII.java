import java.util.*;

public class SingleNumberIII {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(2308, 1447, 1918, 1391, 2308, 216, 1391, 410, 1021, 537, 1825, 1021, 1729, 669, 216, 1825, 537, 1995, 805, 410, 805, 602, 1918, 1447, 90, 1995, 90, 1540, 1161, 1540, 2160, 1235, 1161, 602, 880, 2160, 1235, 669));
        SingleNumberIII singleNumberIII = new SingleNumberIII();
        ArrayList<Integer> output = singleNumberIII.solve(A);
        System.out.println(output.toString());
    }
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int xorOfArray = 0;

        for(int i=0;i<A.size();i++){
            xorOfArray ^= A.get(i);
        }
        int index = -1;
        for(int i=0;i<32;i++){
            if((xorOfArray & (1<<i)) > 0){
                if(index == -1)
                    index = i;
                    break; 
            }
        }
        int firstValue = 0;
        int secondValue = 0;
        
        for(int i=0;i<A.size();i++){
            int currentValue = A.get(i);
            if((currentValue & (1<<index)) > 0){
                firstValue ^= currentValue;
            }
            else{
                secondValue ^= currentValue;
            }
                
        }

        ArrayList<Integer> finalOutput = new ArrayList<>();
        finalOutput.add(Math.min(firstValue,secondValue));
        finalOutput.add(Math.max(secondValue,firstValue));
        return finalOutput;
        

    }
}