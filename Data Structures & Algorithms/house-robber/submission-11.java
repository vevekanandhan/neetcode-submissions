class Solution {

    Map<Integer, Integer> map = new HashMap<>();

    public int dp(int n, int[] nums)
    {
        if(map.containsKey(n))
        {
            return map.get(n);
        }
        if(n == 0)
        {
            return nums[0];
        }

        if(n == 1)
        {
            return Math.max(nums[0], nums[1]);
        }

        map.put(n, Math.max(dp(n - 1, nums),
                            nums[n] + dp(n - 2, nums)));

        return map.get(n);                           
    }

    public int rob(int[] nums) {
        return dp(nums.length - 1, nums);
    }
}
