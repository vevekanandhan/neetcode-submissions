class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int maxArea = 0;
        while (l < r)
        {
            int area = Math.min(heights[l], heights[r]) * (r - l);
            maxArea = Math.max(maxArea, area);
            

            System.out.println("Area : "+area);
            System.out.println("MaxArea : "+maxArea);
            System.out.println("Heights[l] : "+ heights[l]);
            System.out.println("Heights[r] : "+ heights[r]);
            System.out.println("heights[r] * (r - l) : "+ heights[r] * (r - l));

            if(heights[l] <= heights[r])
            {
                l++;
            }
            else
            {
                r--;
            }
        }

        return maxArea;

    }
}
