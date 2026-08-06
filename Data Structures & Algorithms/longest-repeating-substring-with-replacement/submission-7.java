class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> count = new HashMap<>();
        int res = 0;

        int l = 0;
        int max = -1;

        for(int r = 0; r < s.length(); r++)
        {
            char rc = s.charAt(r);

            count.put(rc, count.getOrDefault(rc, 0) + 1);

            max = Math.max(max, count.get(rc));

            while((r - l + 1) - max > k)
            {
                char lc = s.charAt(l);
                count.put(lc, count.get(lc) - 1);
                l++;
            }

            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}
