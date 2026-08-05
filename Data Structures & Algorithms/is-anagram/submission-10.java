class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }

        Map<String, Integer> sCount = new HashMap<>();
        Map<String, Integer> tCount = new HashMap<>();

        for (int i = 0 ; i< s.length(); i++)
        {
        	sCount.put(s.charAt(i) + "", sCount.getOrDefault(s.charAt(i) + "", 0) + 1);
            tCount.put(t.charAt(i) + "", tCount.getOrDefault(t.charAt(i) + "", 0) + 1); 
        }
        for (String key : sCount.keySet())
		{
			if(!sCount.get(key).equals(tCount.get(key)))
			{
				return false;
			}
		}

        return true;
    }
}
