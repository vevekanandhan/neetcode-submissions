class Solution {
    int[] cache;
    public int minCostClimbingStairs(int[] cost) {
        cache = new int[cost.length];
        for(int i = 0 ; i < cost.length; i++)
        {
            cache[i] = -1;
        }
        return Math.min(dfs(cost, 0), dfs(cost, 1));
    }

    public int dfs(int[] cost, int i)
    {
        if(i >= cost.length)
        {
            return 0;
        }

        if(cache[i] != -1)
        {
            return cache[i];
        }

        int sum = cost[i] + dfs(cost, i + 1);
        int sum1 = cost[i] + dfs(cost, i + 2);
        cache[i] = Math.min(sum, sum1);
        return cache[i];
    }
}
