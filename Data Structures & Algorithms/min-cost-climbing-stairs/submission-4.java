class Solution {

    Map<Integer, Integer> map = new HashMap<>();

    public int f(int n, int[] cost)
    {
        if(map.containsKey(n))
        {
            return map.get(n);
        }

        if(n <= 1)
        {
            return 0;
        }

        map.put(n, Math.min(cost[n - 2] + f(n - 2, cost), cost[n - 1] + f(n - 1, cost)));

        return map.get(n);
    }
    public int minCostClimbingStairs(int[] cost) {
        
        return f(cost.length, cost);

    }
}
