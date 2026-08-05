class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int last = s.length() - 1;

        while(start < last)
        {
            while(start < last && !isAlphaChar(s.charAt(start)))
            {
                start++;
            }
            while(last > start && !isAlphaChar(s.charAt(last)))
            {
                last--;
            }
            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(last)))
            {
                return false;
            }
            start++;
            last--;
        }

        return true;
    }

    public boolean isAlphaChar(char c)
    {
        return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9';
    }
}
