import java.util.*;

public class MaxFrequencyStack {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        
        A.add(new ArrayList<>(List.of(1,2)));
        A.add(new ArrayList<>(List.of(2,0)));
        A.add(new ArrayList<>(List.of(1,2)));
        A.add(new ArrayList<>(List.of(1,7)));
        A.add(new ArrayList<>(List.of(2,0)));
        A.add(new ArrayList<>(List.of(2,0)));
        A.add(new ArrayList<>(List.of(1,4)));
        A.add(new ArrayList<>(List.of(1,1)));
        A.add(new ArrayList<>(List.of(1,7)));
        
        MaxFrequencyStack maxFrequencyStack = new MaxFrequencyStack();
        ArrayList<Integer> output = maxFrequencyStack.solve(A);

        System.out.println(output.toString());
         

    }
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> output = new ArrayList<>();

        HashMap<Integer,Integer> frequencyMap = new HashMap<>();
        HashMap<Integer, Stack<Integer>> frequencyStackMap = new HashMap<>();
        int highestFrequency = 0;
        for(int i=0;i<A.size();i++){
            if(A.get(i).get(0) == 1){
                int currentValue = A.get(i).get(1);
                int currentFrequency = 1;
                if(frequencyMap.containsKey(currentValue)){
                    currentFrequency = frequencyMap.get(currentValue)+1;
                    
                }
                frequencyMap.put(currentValue, currentFrequency);
                
                Stack<Integer> currStack;
                if(frequencyStackMap.containsKey(currentFrequency)){
                    currStack = frequencyStackMap.get(currentFrequency);
                    
                }
                else{
                    currStack = new Stack<>();
                }
                currStack.push(currentValue);
                frequencyStackMap.put(currentFrequency, currStack);
                highestFrequency = Math.max(highestFrequency,currentFrequency);
                output.add(-1);
            }
            else if(A.get(i).get(0) == 2 && A.get(i).get(1) == 0){
                 int value = frequencyStackMap.get(highestFrequency).pop();
                 if(frequencyStackMap.get(highestFrequency).isEmpty()){
                     frequencyStackMap.remove(highestFrequency);
                     highestFrequency--;
                 }
                 frequencyMap.put(value,frequencyMap.get(value)-1);
                 if(frequencyMap.get(value) == 0){
                     frequencyMap.remove(value);
                 }
                 output.add(value);
            }
        }

        return output;
    }
}
