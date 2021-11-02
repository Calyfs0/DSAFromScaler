public class Solution {
	public ArrayList<Integer> grayCode(int a) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        res.add(0);
        Set<Integer> set = new HashSet<>();
        set.add(0);
        dfs(res, a, set);
        return res;
	}

    private void dfs(ArrayList<Integer> res, int n, Set<Integer> set) {
        if (res.size() == (1 << n)) return;
        
        int prev = 0, cur = 0;
        for (int i = 0; i < n; i++) {
            prev = res.get(res.size() - 1);
            cur = prev ^ (1 << i);
            if (!set.contains(cur)) {
                set.add(cur);
                res.add(cur);
                dfs(res, n, set);
            }
        }
    }
}
