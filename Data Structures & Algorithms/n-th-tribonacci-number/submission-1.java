class Solution {
    int[] cache;
    public int tribonacci(int n) {

        if(n == 0)
        {
            return 0;
        }

        if(n == 1 || n == 2)
        {
            return 1;
        }

        cache = new int[n + 1];
        for(int i = 0; i < cache.length ; i++)
        {
            cache[i] = -1;
        }

        return dfs(n);
    }

    public int dfs(int n)
    {
        if(n == 0)
        {
            return 0;
        }

        if(n == 1 || n == 2)
        {
            return 1;
        }

        if(cache[n] != -1)
        {
            return cache[n];
        }

        cache[n] = dfs(n - 1) + dfs(n - 2) + dfs(n - 3);

        return cache[n];
    }

}