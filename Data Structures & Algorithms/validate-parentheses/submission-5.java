class Solution {
    public boolean isValid(String s) 
    {
        HashMap<Character, Character> closeVsOpen = new HashMap<>();
        closeVsOpen.put(')', '(');
        closeVsOpen.put(']', '[');
        closeVsOpen.put('}', '{');

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray())
        {
            if(closeVsOpen.containsKey(c))
            {
                if(!stack.isEmpty() && stack.peek() == closeVsOpen.get(c))
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
            else
            {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
