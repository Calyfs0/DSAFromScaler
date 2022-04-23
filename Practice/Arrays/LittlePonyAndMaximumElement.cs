class Solution {
    public int solve(List<int> A, int B) {
        A.Sort();
      
        int index = -1;
        for(int  i=0;i<A.Count;i++){
            if(A[i] == B){
                index = i;
                break;
            }
        }
        if(index == -1) return -1;
        while(index < A.Count && A[index]==A[index+1]){
            index++;
        }

        return A.Count - index - 1;
    }
}
