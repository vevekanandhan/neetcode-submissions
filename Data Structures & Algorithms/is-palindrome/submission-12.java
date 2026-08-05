class Solution {
    public boolean isPalindrome(String s) {
        
        int left = 0;
        int right = s.length() - 1;

        while(left < right)
        {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            Boolean isValidLeftChar = alphaNum(leftChar);
            Boolean isValidRightChar = alphaNum(rightChar);
            
            if(!isValidLeftChar)
            {
            	left++;
            	
			}
            else if(!isValidRightChar)
			{
				right--;
            }
            else
            {
            	if(Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar))
                {
                    return false;
                }
            	left++;
            	right--;
            }
        }

        return true;
    }

    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}
