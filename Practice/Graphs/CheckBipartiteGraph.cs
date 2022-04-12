//Main Method

int A = 10;
List<List<int>> B = new List<List<int>>();
//B.Add(new List<int>() { 7, 8 });
//B.Add(new List<int>() { 1, 2 });
//B.Add(new List<int>() { 0, 9 });
//B.Add(new List<int>() { 1, 3 });
//B.Add(new List<int>() { 6, 7 });
//B.Add(new List<int>() { 0, 3 });
//B.Add(new List<int>() { 2, 5 });
//B.Add(new List<int>() { 3, 8 });
//B.Add(new List<int>() { 4, 8 });

B.Add(new List<int>() { 0, 1 });
B.Add(new List<int>() { 0, 2 });
B.Add(new List<int>() { 1, 2 });

Solution sn = new Solution();
int ans = sn.solve(A, B);
Console.WriteLine(ans);
Console.ReadKey();

class Solution
{
    public int solve(int A, List<List<int>> B)
    {
        Dictionary<int, List<int>> GraphEdgesMap = new Dictionary<int, List<int>>();
        CreateGraphEdgesList(B, GraphEdgesMap);
        int[] visitedArray = new int[A];
        bool ans = true;
        int currentColor = 0;

        for (int i = 0; i < visitedArray.Length; i++)
        {
            visitedArray[i] = -1;
        }


        for (int i = 0; i < A; i++)
        {
            if (visitedArray[i] == -1)
            {
                visitedArray[i] = currentColor;
                CheckBipartiteGraph(i, GraphEdgesMap, visitedArray, currentColor, ref ans);
            }

        }


        return Convert.ToInt32(ans);
    }

    public void CreateGraphEdgesList(List<List<int>> B, Dictionary<int, List<int>> GraphEdgesMap)
    {
        for (int i = 0; i < B.Count; i++)
        {
            if (GraphEdgesMap.ContainsKey(B[i][0]))
            {
                List<int> EdgesList = GraphEdgesMap[B[i][0]];
                EdgesList.Add(B[i][1]);
                GraphEdgesMap[B[i][0]] = EdgesList;
            }
            else
            {
                GraphEdgesMap.Add(B[i][0], new List<int> { B[i][1] });
            }

            if (GraphEdgesMap.ContainsKey(B[i][1]))
            {
                List<int> EdgesList = GraphEdgesMap[B[i][1]];
                EdgesList.Add(B[i][0]);
                GraphEdgesMap[B[i][1]] = EdgesList;
            }
            else
            {
                GraphEdgesMap.Add(B[i][1], new List<int> { B[i][0] });
            }
        }


    }

    public void CheckBipartiteGraph(int x, Dictionary<int, List<int>> GraphEdgesMap, int[] visitedArray, int currentColor, ref bool ans)
    {
        Queue<int> queue = new Queue<int>();
        queue.Enqueue(x);
        while (queue.Count > 0)
        {
            int currValue = queue.Dequeue();
            if (visitedArray[currValue] != -1) { 
                currentColor = 1 - visitedArray[currValue];
            }
            if (GraphEdgesMap.ContainsKey(currValue))
            {
                for (int i = 0; i < GraphEdgesMap[currValue].Count; i++)
                {
                    int val = GraphEdgesMap[currValue][i];
                    if (visitedArray[val] == -1)
                    {
                        visitedArray[val] = currentColor;
                        queue.Enqueue(val);
                    }
                    else if (visitedArray[val] == visitedArray[currValue])
                    {
                        ans = false;
                    }
                }

            }
           // currentColor = 1 - currentColor;
        }
    }
}