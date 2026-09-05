class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> counter1 = new HashMap<>();

        for(char c : t.toCharArray())
        {
            counter1.put(c, counter1.getOrDefault(c, 0 ) + 1);
        }

        int need = counter1.size();
        int have = 0;
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        int resLen = s.length() + 1;

        int l = 0;
        Map<Character, Integer> counter2 = new HashMap<>();

        for(int r = 0; r < s.length(); r++)
        {
            char rc = s.charAt(r);
            counter2.put(rc, counter2.getOrDefault(rc, 0 ) + 1);

            if(counter1.containsKey(rc) && Objects.equals(counter1.get(rc), counter2.get(rc)))
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

                char lc = s.charAt(l);

                counter2.put(lc, counter2.get(lc) - 1);

                if(counter1.containsKey(lc) && counter2.get(lc) < counter1.get(lc))
                {
                    have--;
                }
                
                l++;
            }
        }

        if(res[0] == -1 || res[1] == -1) {
            return "";
        }
        return s.substring(res[0], res[1] + 1);
    }
}
