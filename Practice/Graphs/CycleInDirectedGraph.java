import java.util.*;

public class CycleInDirectedGraph {
    public static void main(String[] args) {
        int A = 5;
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        B.add(new ArrayList<>(Arrays.asList(1, 2)));
        B.add(new ArrayList<>(Arrays.asList(1, 3)));
        B.add(new ArrayList<>(Arrays.asList(2, 3)));
        B.add(new ArrayList<>(Arrays.asList(1, 4)));
        B.add(new ArrayList<>(Arrays.asList(4, 3)));
        B.add(new ArrayList<>(Arrays.asList(4, 5)));
        B.add(new ArrayList<>(Arrays.asList(3, 5)));

        CycleInDirectedGraph cycleInDirectedGraph = new CycleInDirectedGraph();
        int ans = cycleInDirectedGraph.solve(A, B);
        System.out.println(ans);

    }

    public int solve(int A, ArrayList<ArrayList<Integer>> B) {
        Map<Integer, ArrayList<Integer>> graphMap = new HashMap<>();
        int[] visitedArray = new int[A + 1];
        CreateGraph(B, graphMap);
        for (int i = 1; i <= A; i++) {
            if (visitedArray[i] == 0) {
                if (bfs(graphMap, i, visitedArray))
                    return 1;
            }
        }

        return 0;

    }

    public void CreateGraph(ArrayList<ArrayList<Integer>> B, Map<Integer, ArrayList<Integer>> graphMap) {
        for (ArrayList<Integer> connection : B) {
            int fromNode = connection.get(0);
            int toNode = connection.get(1);
            ArrayList<Integer> connections;
            if (graphMap.containsKey(fromNode)) {
                connections = graphMap.get(fromNode);
            } else {
                connections = new ArrayList<>();
            }
            connections.add(toNode);
            graphMap.put(fromNode, connections);
        }
    }

    public boolean bfs(Map<Integer, ArrayList<Integer>> graphMap, int val, int[] visitedArray) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(val);
        while (!q.isEmpty()) {
            int currentValue = q.poll();
            visitedArray[currentValue] = 1;
            if (graphMap.containsKey(currentValue)) {
                ArrayList<Integer> connections = graphMap.get(currentValue);
                for (int i = 0; i < connections.size(); i++) {
                    int currentConnection = connections.get(i);
                    if (visitedArray[currentConnection] == 1)
                        return true;
                    q.offer(currentConnection);

                }
            }
        }
        return false;
    }
}
