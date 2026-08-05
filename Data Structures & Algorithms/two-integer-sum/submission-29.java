class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> maps = new HashMap<>();

        int i = 0;
        for(int n : nums)
        {
            int k = target - n;

            if(maps.containsKey(k))
            {
                return new int[] {maps.get(k), i};
            }

            maps.put(n, i++);
        }

        return new int[]{-1, -1};
    }
}
