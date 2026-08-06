class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;

        int[] res = new int[n - k + 1];
        int i = 0;

        Deque<Integer> queue = new LinkedList<>();

        for(int r = 0; r < n; r++)
        {
            while(!queue.isEmpty() && queue.peekFirst() <= r - k)
            {
                queue.pollFirst();
            }
            while(!queue.isEmpty() && nums[queue.peekLast()] <= nums[r])
            {
                queue.pollLast();
            }
            

            queue.add(r);

            if(r >= k - 1)
            {
                res[i++] = nums[queue.peekFirst()];
            }
            
        }

        return res;
    }
}
