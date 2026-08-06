class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length())
        {
            return false;
        }

        Map<Character, Integer> counter1 = new HashMap<>();

        for(char c : s1.toCharArray())
        {
            counter1.put(c, counter1.getOrDefault(c, 0) + 1);
        }

        int need = counter1.size();

        for(int i = 0; i < s2.length(); i++)
        {
            Map<Character, Integer> counter2 = new HashMap<>();
            int curr = 0;
            for(int j = i;j < s2.length(); j++)
            {
                char c = s2.charAt(j);
                counter2.put(c, counter2.getOrDefault(c, 0) + 1);

                if(counter1.getOrDefault(c, 0) < counter2.get(c))
                {
                    break;
                }

                if(counter1.getOrDefault(c, 0) == counter2.get(c))
                {
                    curr++;
                }
                

                if(curr == need)
                {
                    return true;
                }

            }
        }

        return false;
    }
}
