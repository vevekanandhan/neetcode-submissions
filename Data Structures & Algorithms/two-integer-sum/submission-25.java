class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valueVsIndex = new HashMap<>();

        for(int i = 0 ; i < nums.length; i++)
        {
            int expectedVal = target - nums[i]; 
            if(valueVsIndex.containsKey(expectedVal))
            {
                return new int[] {valueVsIndex.get(expectedVal), i};
            }
            else
            {
                valueVsIndex.put(nums[i], i);
            }

        }

        return new int[] {-1, -1};
    }
}
