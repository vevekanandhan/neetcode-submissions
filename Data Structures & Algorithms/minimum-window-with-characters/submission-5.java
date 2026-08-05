class Solution {
    public String minWindow(String s, String t) 
    {
        if(s.length() < t.length())
        {
            return "";
        }
        HashMap<Character, Integer> tCount = new HashMap<>();

        for(int i = 0; i < t.length(); i++)
        {
            tCount.put(t.charAt(i), tCount.getOrDefault(t.charAt(i), 0) + 1);
        }
        
        HashMap<Character, Integer> resCount = new HashMap<>();

        int l = 0, resLen = Integer.MAX_VALUE;
        int[] res = {-1, -1};
        int have = 0, need = tCount.size();

        for(int r = 0; r < s.length(); r++)
        {
            char c = s.charAt(r);
            resCount.put(c, resCount.getOrDefault(c, 0) + 1);
                
            if(tCount.containsKey(c) && resCount.get(c).equals(tCount.get(c)))
            {
                have++;
            }

            while(have == need)
            {
                if((r - l + 1) < resLen)
                {
                    resLen = (r - l + 1);
                    res[0] = l;
                    res[1] = r;
                }
                char leftChar = s.charAt(l);
                resCount.put(leftChar, resCount.get(leftChar) - 1);

                if(tCount.containsKey(leftChar) && resCount.get(leftChar) < tCount.get(leftChar))
                {
                    have--;
                }

                l++;
            }

        }

        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
    }
}
