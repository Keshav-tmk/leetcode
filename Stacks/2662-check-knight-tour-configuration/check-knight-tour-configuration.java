class Solution {
    public boolean help(int[][] grid, int r, int c,int n, int exp) {
        if (r < 0 || c < 0 || r >= grid[0].length || c >= grid[0].length || grid[r][c] != exp)
            return false;

        if (exp==n*n-1)
            return true;

        boolean ans1 = help(grid, r - 2, c + 1,n, exp + 1);
        boolean ans2 = help(grid, r - 1, c + 2, n,exp + 1);
        boolean ans3 = help(grid, r + 1, c + 2,n, exp + 1);
        boolean ans4 = help(grid, r + 2, c + 1,n, exp + 1);
        boolean ans5 = help(grid, r + 2, c - 1,n, exp + 1);
        boolean ans6 = help(grid, r + 1, c - 2,n, exp + 1);
        boolean ans7 = help(grid, r - 1, c - 2,n, exp + 1);
        boolean ans8 = help(grid, r - 2, c - 1,n, exp + 1);

        return ans1 || ans2 || ans3 || ans4 || ans5 || ans6 || ans7 || ans8;
    }

    public boolean checkValidGrid(int[][] grid) {
        int n = grid[0].length;

        return help(grid, 0, 0, n, 0);

    }
}