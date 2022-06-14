import java.util.*;
public class FinishMaximumJobs {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> mergeArrays = new ArrayList<>();

        for(int i=0;i<A.size();i++){
            ArrayList<Integer> input = new ArrayList<>();
            input.add(A.get(i));
            input.add(B.get(i));
            mergeArrays.add(input);
        }

        Collections.sort(mergeArrays, new customComparator());

        int count = 1;
        int endTime = mergeArrays.get(0).get(1);
        for(int i=1;i<mergeArrays.size();i++){
            if(mergeArrays.get(i).get(0) >= endTime){
                count++;
                endTime = mergeArrays.get(i).get(1);
            } 
            
        }

        return count;
    }

}

class customComparator implements Comparator<ArrayList<Integer>>{
    public int compare(ArrayList<Integer> A, ArrayList<Integer> B){
        return A.get(1) - B.get(1);
    }
}
