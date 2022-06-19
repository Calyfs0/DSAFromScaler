import java.util.*;
public class AllUniquePermutations {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        Collections.sort(A);
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        CalculatePermuations(0,A,output);
        return output;

    }

    public void CalculatePermuations(int i, ArrayList<Integer> A,ArrayList<ArrayList<Integer>> output){
        if(i == A.size()){
            if(!output.contains(A)){
                output.add(new ArrayList<Integer>(A));
            
            }
            return;
        }
        for(int j=i;j<A.size();j++){
            swap(A,i,j);
            CalculatePermuations(i+1,A,output);
            swap(A,i,j);
        }
        
    }

    public void swap(ArrayList<Integer> A, int i, int j){
        int temp = A.get(i);
        A.set(i, A.get(j));
        A.set(j,temp);
    }
}
