class Solution {

    int[][] cache;

    public int rob(int[] nums) {

        cache = new int[nums.length][2];

        for(int i = 0; i < nums.length; i++)
        {
            cache[i][0] = -1;
            cache[i][1] = -1;
        }

        if (nums.length == 1) return nums[0];
        return Math.max(dfs(0, true, nums), dfs(1, false, nums));
    }

    private int dfs(int i, boolean flag, int[] nums) {
        if (i >= nums.length || (flag && i == nums.length - 1))
            return 0;

        int fIdx = flag ? 1 : 0;
        if(cache[i][fIdx] != -1)
        {
            return cache[i][fIdx];
        }    

        int currSum = nums[i] + dfs(i + 2, flag, nums);

        int skipSum = dfs(i + 1, flag, nums);

        cache[i][fIdx] = Math.max(currSum, skipSum);
        return cache[i][fIdx];
    }
}