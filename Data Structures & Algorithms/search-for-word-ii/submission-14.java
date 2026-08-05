class TrieNode
{
    HashMap<Character, TrieNode> children;
    boolean isWord;

    public TrieNode()
    {
        children = new HashMap<>();
        isWord = false;
    }

    public void addWord(String word)
    {
        TrieNode curr = this;
        for(char c : word.toCharArray())
        {
            curr.children.putIfAbsent(c, new TrieNode());
            curr = curr.children.get(c);
        }

        curr.isWord = true;
    }
}

class Solution {

    Set<String> res;
    boolean[][] visited;

    public List<String> findWords(char[][] board, String[] words) {

        TrieNode root = new TrieNode();
        for(String s : words)
        {
            root.addWord(s);
        }

        int ROW = board.length;
        int COL = board[0].length;

        res = new HashSet<>();
        visited = new boolean[ROW][COL];

        for(int r = 0 ; r < ROW; r++)
        {
            for(int c = 0 ; c < COL; c++)
            {
                dfs(board, r, c, root, "");
            }
        }

        return new ArrayList<String> (res);
        
    }

    public void dfs(char[][] board, int r, int c, TrieNode root, String word)
    {

        if(r < 0 || c < 0 || r >= board.length || c >= board[0].length || visited[r][c] || !root.children.containsKey(board[r][c]) )
        {
            return;
        }

        word +=board[r][c];
        visited[r][c] = true;    
        root = root.children.get(board[r][c]);

        if(root.isWord)
        {
            res.add(word);
        }

        dfs(board, r + 1, c, root, word);
        dfs(board, r - 1 , c, root, word);
        dfs(board, r, c + 1, root, word);
        dfs(board, r, c - 1, root, word);

        visited[r][c] = false;
    }
}
