class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valIndexes = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            int sum = target - nums[i];

            if(valIndexes.containsKey(sum))
            {
                return new int[] {valIndexes.get(sum), i};
            }

            valIndexes.put(nums[i], i);
        }

        return new int[] {-1, -1};
    }
}
