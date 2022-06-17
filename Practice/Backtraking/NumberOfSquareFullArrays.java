import java.util.ArrayList;
import java.util.Arrays;

public class NumberOfSquareFullArrays{


    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,17,8));
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        NumberOfSquareFullArrays numberOfSquareFullArrays = new NumberOfSquareFullArrays();

        numberOfSquareFullArrays.solve(A,0,list);

        System.out.println(list.size());
    }

    public void solve(ArrayList<Integer> A, int i,ArrayList<ArrayList<Integer>> list){
        if(i == A.size()){
            if(!list.contains(A)){
                list.add(new ArrayList<Integer>(A));
            }
            return;
        }

        for(int j=i;j<A.size();j++){
            swap(A,i,j);
            if(i == 0 || (isSquareRoot(A.get(i-1), A.get(i)))){
                solve(A,i+1,list);
            }
            swap(A,i,j);
        }
    }

    public void swap(ArrayList<Integer> A, int i, int j){
        int temp = A.get(i);
        A.set(i,A.get(j));
        A.set(j,temp);
    }

    public boolean isSquareRoot(int A, int B){
        long sum = (long)A + B;
        double square = Math.sqrt(sum);
        double floor = Math.floor(square);
        if(square == floor) return true;
        
        return false;
    }

}