class Solution {
    public int characterReplacement(String s, int k) 
    {
        HashMap<Character, Integer> count = new HashMap<>();

        int l = 0, maxV = 0, res = 0;

        for(int r = 0; r < s.length(); r++)
        {
            count.put(s.charAt(r), count.getOrDefault(s.charAt(r), 0) + 1);

            maxV = Math.max(maxV, count.get(s.charAt(r)));

            while((r - l + 1) - maxV > k)
            {
                count.put(s.charAt(l), count.get(s.charAt(l)) - 1);
                l++;
            }

            res = Math.max(res, (r - l + 1));
        }

        return res;
    }
}
