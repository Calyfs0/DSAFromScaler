import java.util.*;
public class TopologicalSorting{
    public ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {
        int[] indegreeArray = new int[A+1]; //number of incoming nodes to a particular node
        ArrayList<Integer> output = new ArrayList<>();

        HashMap<Integer, ArrayList<Integer>> nodesMap = new HashMap<>(); //Graph

        for(int i=0;i<B.size();i++){
            int fromNode = B.get(i).get(0);
            int toNode = B.get(i).get(1);

            ArrayList<Integer> nodeList;

            if(nodesMap.containsKey(fromNode)){
                nodeList = nodesMap.get(fromNode);
            }
            else{
                nodeList = new ArrayList<>();
            }
            nodeList.add(toNode);
            nodesMap.put(fromNode, nodeList);
            indegreeArray[toNode] = indegreeArray[toNode] + 1;
        }

        PriorityQueue<Integer> zeroIndegreeQueue = new PriorityQueue<Integer>();

        for(int i=1;i<indegreeArray.length;i++){
            int currentValue = indegreeArray[i];
            if(currentValue == 0){
                zeroIndegreeQueue.offer(i);
            }
        }

        while(!zeroIndegreeQueue.isEmpty()){
            int val = zeroIndegreeQueue.poll();
            output.add(val);
            if(nodesMap.containsKey(val)){
                ArrayList<Integer> nodeList = nodesMap.get(val);

                for(int i=0;i<nodeList.size();i++){
                    int currentNode = nodeList.get(i);
                    indegreeArray[currentNode] = indegreeArray[currentNode] - 1;
                    if(indegreeArray[currentNode] == 0){
                        zeroIndegreeQueue.offer(currentNode);   
                    }
                }
            }
        }

        if(output.size() != A){
            new ArrayList<Integer>();
        }

        return output;
    }
}