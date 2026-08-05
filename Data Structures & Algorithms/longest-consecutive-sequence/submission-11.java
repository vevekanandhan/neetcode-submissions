class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for(int num : nums)
        {
            numSet.add(num);
        }

        int longest = 0;

        for(int num : nums)
        {
            int counter = 1;

            if(!numSet.contains(num - 1))
            {
                while(numSet.contains(num + counter))
                {
                  counter++;
                }

                longest = Math.max(longest, counter);
            }
        }

        return longest;
    }
}
