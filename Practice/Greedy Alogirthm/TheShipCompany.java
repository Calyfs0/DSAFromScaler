import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Arrays;;
public class TheShipCompany {
    public ArrayList<Integer> solve(int A, int B, ArrayList<Integer> C) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((a,b) -> b-a);


        for(int i=0;i<C.size();i++){
            int value = C.get(i);
            minHeap.offer(value);
            maxHeap.offer(value);
        }
        int min = calculateMinValue(A, C, minHeap);
        int max = calculateMaxValue(A, C, maxHeap);
        ArrayList<Integer> output = new ArrayList<>(Arrays.asList(max,min));
        return output;
        
    }

    public int calculateMinValue(int A, ArrayList<Integer> C, PriorityQueue<Integer> minHeap){
        int min = 0;
        for(int i=0;i<A;i++){
            int minValue = minHeap.poll();
            min += minValue;
            minValue -= 1;
            if(minValue > 0){
                minHeap.offer(minValue);
            }
            
        }

        return min;
    }

    public int calculateMaxValue(int A, ArrayList<Integer> C, PriorityQueue<Integer> maxHeap){
        int max = 0;
        for(int i=0;i<A;i++){
            int maxValue = maxHeap.poll();
            max += maxValue;
            maxValue -= 1;
            if(maxValue > 0){
                maxHeap.offer(maxValue);
            }
            
        }

        return max;
    }
}
