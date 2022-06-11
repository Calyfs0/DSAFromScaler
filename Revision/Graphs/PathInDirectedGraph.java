import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class PathInDirectedGraph {
    public int solve(int A, ArrayList<ArrayList<Integer>> B) {
        // Creating adjacency list
        HashMap<Integer, ArrayList<Integer>> adjacencyMap = new HashMap<>();
        createAdjacencyList(B, adjacencyMap);
        // check if 1 has a path to A through breath first search
        return bfs(1, adjacencyMap, A);
    }

    public int bfs(int node, HashMap<Integer, ArrayList<Integer>> adjacencyMap, int A) {
        Queue<Integer> bfsQueue = new LinkedList<>();
        bfsQueue.offer(node);
        while (!bfsQueue.isEmpty()) {
            int currentValue = bfsQueue.poll();
            if (adjacencyMap.containsKey(currentValue)) {
                ArrayList<Integer> valueList = adjacencyMap.get(currentValue);
                for (int i = 0; i < valueList.size(); i++) {
                    int value = valueList.get(i);
                    if (value == A)
                        return 1;
                    bfsQueue.add(value);
                }
            }
        }

        return 0;
    }

    public void createAdjacencyList(ArrayList<ArrayList<Integer>> B,
            HashMap<Integer, ArrayList<Integer>> adjacencyMap) {
        for (int i = 0; i < B.size(); i++) {
            int currentKey = B.get(i).get(0);
            int currentValue = B.get(i).get(1);
            ArrayList<Integer> currentValueList;
            if (adjacencyMap.containsKey(currentKey)) {
                currentValueList = adjacencyMap.get(currentKey);
                currentValueList.add(currentValue);

            } else {
                currentValueList = new ArrayList<>();
                currentValueList.add(currentValue);
            }
            adjacencyMap.put(currentKey, currentValueList);

        }
    }
}