import java.util.*;

public class CheckBipartiteGraph {
    int color;

    public int solve(int A, ArrayList<ArrayList<Integer>> B) {
        HashMap<Integer, ArrayList<Integer>> adjacencyMap = new HashMap<>();
        createAdjacencyList(B, adjacencyMap);
        color = 1;
        int[] colorArray = new int[A];
        for (int i = 0; i < A; i++) {
            if (colorArray[i] == 0) {
                colorArray[i] = color;
                if (bfs(i, adjacencyMap, colorArray) == 0) {
                    return 0;
                }
            }
        }

        return 1;

    }

    public int bfs(int node, HashMap<Integer, ArrayList<Integer>> adjacencyMap, int[] colorArray) {
        Queue<Integer> bfsQueue = new LinkedList<Integer>();
        bfsQueue.offer(node);

        while (!bfsQueue.isEmpty()) {
            int currentNode = bfsQueue.poll();
            int currentColor = colorArray[currentNode];
            color = currentColor % 2 + 1;

            if (adjacencyMap.containsKey(currentNode)) {
                ArrayList<Integer> currentList = adjacencyMap.get(currentNode);
                for (int i = 0; i < currentList.size(); i++) {
                    int value = currentList.get(i);
                    if (colorArray[value] != 0) {
                        if (colorArray[currentNode] == colorArray[value])
                            return 0;
                    } else {
                        colorArray[value] = color;
                        bfsQueue.offer(value);
                    }

                }
            }
        }

        return 1;
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

            if (adjacencyMap.containsKey(currentValue)) {
                currentValueList = adjacencyMap.get(currentValue);
                currentValueList.add(currentKey);

            } else {
                currentValueList = new ArrayList<>();
                currentValueList.add(currentKey);
            }

            adjacencyMap.put(currentValue, currentValueList);

        }
    }

}
