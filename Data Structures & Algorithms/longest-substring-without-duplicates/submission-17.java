class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int length = 0;

        Set<Character> charSet = new HashSet<>();

        while(r < s.length())
        {
            char c = s.charAt(r);
            if(charSet.contains(c))
            {
                length = Math.max(length, charSet.size());
                charSet.remove(s.charAt(l++));
            }
            else
            {
                charSet.add(c);
                r++;
            }
        }

        length = Math.max(length, charSet.size());
        return length;
    }
}
