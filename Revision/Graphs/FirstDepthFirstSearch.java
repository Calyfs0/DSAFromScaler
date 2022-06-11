import java.util.*;

public class FirstDepthFirstSearch {
    boolean t;

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 1, 2));
        int B = 2;
        int C = 1;
        FirstDepthFirstSearch firstDepthFirstSearch = new FirstDepthFirstSearch();
        System.out.println(firstDepthFirstSearch.solve(A, B, C));

    }

    public int solve(ArrayList<Integer> A, final int B, final int C) {
        t = false;
        HashMap<Integer, ArrayList<Integer>> pathListMap = new HashMap<>();
        int[] visitedArray = new int[A.size() + 1];
        createPathListMap(pathListMap, A);
        dfs(C, visitedArray, pathListMap);
        if (visitedArray[B] == 1)
            return 1;
        return 0;

    }

    public void createPathListMap(HashMap<Integer, ArrayList<Integer>> pathListMap, ArrayList<Integer> A) {
        for (int i = 0; i < A.size(); i++) {
            int currentNode = A.get(i);
            int connectedNode = i + 1;

            ArrayList<Integer> nodeList;
            if (pathListMap.containsKey(currentNode)) {
                nodeList = pathListMap.get(currentNode);
            } else {
                nodeList = new ArrayList<>();
            }

            nodeList.add(connectedNode);
            pathListMap.put(currentNode, nodeList);
        }
    }

    public void dfs(int node, int[] visitedArray, HashMap<Integer, ArrayList<Integer>> pathListMap) {

        visitedArray[node] = 1;
        if (pathListMap.containsKey(node)) {
            for (int nodeValue : pathListMap.get(node)) {
                if (visitedArray[nodeValue] == 0) {
                    dfs(nodeValue, visitedArray, pathListMap);
                }

            }
        }

    }
}
