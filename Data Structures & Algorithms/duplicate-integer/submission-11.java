class Solution {
    public boolean hasDuplicate(int[] nums) {

        List<Integer> numbers = new ArrayList<>(nums.length);
        for(int i = 0; i < nums.length ; i++)
        {
            if(numbers.contains(nums[i]))
            {
                return true;
            }

            numbers.add(nums[i]);
        }

        return false;
    }
}