class Solution {
    public int numIslands(char[][] grid) {

        int ROW = grid.length;
        int COL = grid[0].length ;
        int isLands = 0;
        for(int r  = 0; r < ROW; r++)
        {
            for(int c = 0; c < COL; c++)
            {
                if(grid[r][c] == '1')
                {
                    dfs(grid, r, c);
                    isLands++;
                }
            }
        }

        return isLands;
    }

    public void dfs(char[][] grid, int r, int c)
    {

        if(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == '0')
        {
            return;
        }

        grid[r][c] = '0';

        dfs(grid, r + 1, c);
        dfs(grid, r - 1, c);
        dfs(grid, r, c + 1);
        dfs(grid, r, c - 1);

    }
}
