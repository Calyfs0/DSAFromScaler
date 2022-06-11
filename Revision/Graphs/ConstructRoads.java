import java.util.*;

public class ConstructRoads {
    int color;
    int colorOneCount;
    int colorTwoCount;

    public static void main(String[] args) {
        int A = 8;
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        B.add(new ArrayList<>(List.of(4, 1)));
        B.add(new ArrayList<>(List.of(6, 3)));
        B.add(new ArrayList<>(List.of(8, 1)));
        B.add(new ArrayList<>(List.of(5, 2)));
        B.add(new ArrayList<>(List.of(3, 2)));
        B.add(new ArrayList<>(List.of(2, 1)));
        B.add(new ArrayList<>(List.of(7, 6)));
        ConstructRoads constructRoads = new ConstructRoads();
        System.out.println(constructRoads.solve(A, B));

    }

    public int solve(int A, ArrayList<ArrayList<Integer>> B) {
        color = 1;
        colorOneCount = 0;
        colorTwoCount = 0;
        int mod = 1000000007;
        int[] colorArray = new int[A + 1];
        HashMap<Integer, ArrayList<Integer>> adjacencyList = new HashMap<>();
        createAdjacencyList(B, adjacencyList);
        for (int i = 1; i <= A; i++) {
            if (colorArray[i] == 0) {
                colorArray[i] = color;

                if (color == 1) {
                    colorOneCount++;
                } else {
                    colorTwoCount++;
                }
                bfs(i, adjacencyList, colorArray);
            }
        }

        long actualValue = ((long) colorOneCount * colorTwoCount) % mod;
        return (int) actualValue - (A - 1);
    }

    public void createAdjacencyList(ArrayList<ArrayList<Integer>> B,
            HashMap<Integer, ArrayList<Integer>> adjacencyList) {
        for (int i = 0; i < B.size(); i++) {
            int firstValue = B.get(i).get(0);
            int secondValue = B.get(i).get(1);

            ArrayList<Integer> nodeList;
            if (adjacencyList.containsKey(firstValue)) {
                nodeList = adjacencyList.get(firstValue);
            } else {
                nodeList = new ArrayList<>();

            }
            nodeList.add(secondValue);
            adjacencyList.put(firstValue, nodeList);

            if (adjacencyList.containsKey(secondValue)) {
                nodeList = adjacencyList.get(secondValue);
            } else {
                nodeList = new ArrayList<>();

            }
            nodeList.add(firstValue);
            adjacencyList.put(secondValue, nodeList);
        }
    }

    public void bfs(int node, HashMap<Integer, ArrayList<Integer>> adjacencyList, int[] colorArray) {
        Queue<Integer> roadQueue = new LinkedList<Integer>();
        roadQueue.offer(node);

        while (!roadQueue.isEmpty()) {
            int currentNode = roadQueue.poll();
            color = colorArray[currentNode] % 2 + 1;

            if (adjacencyList.containsKey(currentNode)) {
                ArrayList<Integer> nodeList = adjacencyList.get(currentNode);
                for (int i = 0; i < nodeList.size(); i++) {
                    int currentValue = nodeList.get(i);
                    if (colorArray[currentValue] == 0) {
                        colorArray[currentValue] = color;
                        roadQueue.offer(currentValue);
                        if (color == 1) {
                            colorOneCount++;
                        } else {
                            colorTwoCount++;
                        }
                    }
                }
            }
        }
    }
}
