class Solution {
    public int maxProduct(int[] nums) {
        int max= nums[0];
        int currMAX = 1;
        int currMin = 1;

        for(int num : nums)
        {
            if (num == 0) {
                currMin = 1;
                currMAX = 1;
                max = Math.max(max, 0); // handle zero case
                continue;
            }

            int temp = currMAX * num;

            currMAX = Math.max(Math.max(currMAX * num, currMin * num), num);
            currMin = Math.min(Math.min(temp, currMin * num), num);

            max = Math.max(max, currMAX);
        }

        return max;
    }
}
