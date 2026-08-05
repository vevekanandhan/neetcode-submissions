class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for(int n : nums)
        {
            map.put(n , map.getOrDefault(n, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            freq[entry.getValue()] = freq[entry.getValue()] == null ? new ArrayList<>() : freq[entry.getValue()];
            freq[entry.getValue()].add(entry.getKey());
        }
        
        System.out.println(map);

        System.out.println(Arrays.asList(freq));
        
        int[] res = new int[k];
        
        for(int i = freq.length -1, j = 0; i >= 0 && j < k; i--)
        {
        	if(freq[i] != null)
        	{
        		for(int n : freq[i])
        		{
        			res[j++] = n;
        		}
        	}
        	
        	if(j == k)
			{
				return res;
			}
        }
        
        return res;
    }
}
