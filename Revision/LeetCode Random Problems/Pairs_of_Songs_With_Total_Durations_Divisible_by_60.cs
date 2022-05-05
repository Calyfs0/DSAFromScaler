public class Solution {
    public int NumPairsDivisibleBy60(int[] time) {
        Dictionary<int,int> hs = new Dictionary<int,int>();
        int count = 0;
        for(int i=0;i<time.Length;i++){
            
            time[i] = time[i]%60;
        }
        
        for(int i=0;i<time.Length;i++){
            int diff = 60 - time[i];
            int val = hs.GetValueOrDefault(diff%60);
            if(val!=0){
                count +=val;
            }
            
            int value = hs.GetValueOrDefault(time[i]);
            if(value!=0){
                hs[time[i]] = value+1;
            }
            else{
                hs.Add(time[i],1);
            }
            
        }
        
        return count;
    }
}