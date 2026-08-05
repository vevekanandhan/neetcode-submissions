class TrieNode
{
    public HashMap<Character, TrieNode> childrens = new HashMap<>();
    public boolean endOfWord = false;
}

class PrefixTree {

    private TrieNode root;

    public PrefixTree() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode curr = root;
        for(char c : word.toCharArray())
        {
            curr.childrens.putIfAbsent(c, new TrieNode());
            curr = curr.childrens.get(c);
        }
        curr.endOfWord = true;
    }

    public boolean search(String word) {
        TrieNode curr = root;
        for(char c : word.toCharArray())
        {
            if(curr.childrens.containsKey(c))
            {
                curr = curr.childrens.get(c);
            }else
            {
               return false;
            }
        }

        if(curr.endOfWord == true)
        {
            return true;
        }

        return false;

    }

    public boolean startsWith(String prefix) {
        TrieNode curr = root;
        for(char c : prefix.toCharArray())
        {
            if(curr.childrens.containsKey(c))
            {
                curr = curr.childrens.get(c);
            }else
            {
               return false;
            }
        }

        return true;
    }
}
