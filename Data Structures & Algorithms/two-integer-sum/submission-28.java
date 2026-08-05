class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsIndexes = new HashMap<>();

        int i = 0;
        for(int num : nums)
        {
            int req = target - num;

            if(numsIndexes.containsKey(req))
            {
                return new int[]{numsIndexes.get(req), i};
            }

            numsIndexes.put(num, i++);

        }

        return new int[]{-1, -1};
    }
}
