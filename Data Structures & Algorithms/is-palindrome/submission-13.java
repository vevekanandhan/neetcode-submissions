class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while(l < r)
        {
            boolean isValidLeft = Character.isLetterOrDigit(s.charAt(l));
            boolean isValidRight = Character.isLetterOrDigit(s.charAt(r));

            if(!isValidLeft)
            {
                l++;
            }
            if(!isValidRight)
            {
                r--;
            }

            if(isValidLeft && isValidRight)
            {
                if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
                {
                    return false;
                }
                l++;
                r--;
            }

        }

        return true;
    }
}
