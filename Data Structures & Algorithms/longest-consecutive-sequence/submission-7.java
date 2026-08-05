class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 1)
        {
            return 1;
        }

        Set<Integer> numbers = new HashSet<>();

        for(int num : nums)
        {
            numbers.add(num);
        }

        int streak = 0;
        
        for(int number : numbers)
        {
            if(!numbers.contains(number - 1))
            {
                int value = 1;
                while(numbers.contains(number + value))
                {
                    value++;
                }
                streak = Math.max(streak, value);
            }
        }

        return streak;
    }
}
