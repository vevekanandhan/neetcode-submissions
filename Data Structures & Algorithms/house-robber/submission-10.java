class Solution {

    int[] cache;

    public int rob(int[] nums) {
        cache = new int[nums.length];

        for(int i = 0; i < nums.length; i++)
        {
            cache[i] = -1;
        }

        return solve(nums, 0);
    }

    public int solve(int[] nums, int i)
    {
        if(i >= nums.length)
        {
            return 0;
        }

        if(cache[i] != -1)
        {
            return cache[i];
        }

        int currMoney = nums[i] + solve(nums, i + 2);

        int skipMoney = solve(nums, i + 1);

        cache[i] = Math.max(currMoney, skipMoney);

        return cache[i];
    }
}
