class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int level = 0;
        while(left < right)
        {
            level = Math.max(level, (right - left) * Math.min(heights[right], heights[left]));

            if(heights[left] < heights[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }

        return level;
    }
}
