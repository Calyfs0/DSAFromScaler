import java.util.*;
public class Dijkstra {
    public ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B, int C) {
        ArrayList<Integer> output = new ArrayList<>();
        for(int i=0;i<A;i++){
            if(i == C){
                output.add(0);
            }
            else{
                output.add(Integer.MAX_VALUE);
            }
            
        }
        HashMap<Integer, ArrayList<ArrayList<Integer>>> graphMap = new HashMap<>();
        CreateGraph(B, graphMap);

        Queue<Integer> nodeQueue = new LinkedList<Integer>();
        nodeQueue.offer(C);
        
        while(!nodeQueue.isEmpty()){
            int currentNodeValue = nodeQueue.poll();

            if(graphMap.containsKey(currentNodeValue)){
                ArrayList<ArrayList<Integer>> nodeWeightList = graphMap.get(currentNodeValue);
                for(ArrayList<Integer> nodeWeight : nodeWeightList){
                    int toNode = nodeWeight.get(0);
                    int weight = nodeWeight.get(1);

                    long distance = output.get(currentNodeValue)+(long)weight;

                    if(distance < output.get(toNode)){
                        output.set(toNode,(int)distance);
                        nodeQueue.offer(toNode);
                    }

                    
                }
            }
        }
        for(int i=0;i<output.size();i++){
            if(output.get(i) == Integer.MAX_VALUE){
                output.set(i, -1);
            }
        }

        return output;
    }

    public void CreateGraph(ArrayList<ArrayList<Integer>> B, HashMap<Integer, ArrayList<ArrayList<Integer>>> graphMap){
        

        for(ArrayList<Integer> node : B){
            int fromNode = node.get(0);
            int toNode = node.get(1);
            int weight = node.get(2);
            ArrayList<ArrayList<Integer>> nodeWeightList;
            ArrayList<Integer> input;
            if(graphMap.containsKey(fromNode)){
                nodeWeightList = graphMap.get(fromNode);
            }
            else{
                nodeWeightList = new ArrayList<ArrayList<Integer>>();
            }
            input = new ArrayList<Integer>(Arrays.asList(toNode, weight));
            nodeWeightList.add(input);
            graphMap.put(fromNode, nodeWeightList);

            if(graphMap.containsKey(toNode)){
                nodeWeightList = graphMap.get(toNode);
            }
            else{
                nodeWeightList = new ArrayList<ArrayList<Integer>>();
            }
            input = new ArrayList<Integer>(Arrays.asList(fromNode, weight));
            nodeWeightList.add(input);
            graphMap.put(toNode, nodeWeightList);

        }
    }
}
