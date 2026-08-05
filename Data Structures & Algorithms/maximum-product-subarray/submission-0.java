class Solution {
    public int maxProduct(int[] nums) {
        int max= nums[0];
        int currMAX = 1;
        int currMin = 1;

        for(int num : nums)
        {
            int temp = currMAX * num;

            currMAX = Math.max(Math.max(currMAX * num, currMin * num), num);
            currMin = Math.min(Math.min(temp, currMin * num), num);

            max = Math.max(max, currMAX);
        }

        return max;
    }
}
