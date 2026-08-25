class Solution {

    class pair {
        int i;
        int j;
        int t;

        pair(int i, int j, int t) {
            this.i = i;
            this.j = j;
            this.t = t;

        }
    }

    public int orangesRotting(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        Queue<pair> q = new LinkedList<>();
        int max = 0;

        boolean[][] vis = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new pair(i, j, 0));
                    vis[i][j] = true;
                }
            }
        }

        while (!q.isEmpty()) {
            pair curr = q.poll();
            int i = curr.i;
            int j = curr.j;
            int t = curr.t;

            max = Math.max(max, t);

            if (i - 1 >= 0 && vis[i - 1][j] == false && grid[i - 1][j] == 1) {
                q.offer(new pair(i - 1, j, t + 1));
                vis[i-1][j] = true;
            }

            if (i + 1 < n && vis[i + 1][j] == false && grid[i + 1][j] == 1) {
                vis[i+1][j] = true;
                q.offer(new pair(i + 1, j, t + 1));
            }
            if (j - 1 >= 0 && vis[i][j - 1] == false && grid[i][j - 1] == 1) {
                vis[i][j-1] = true;
                q.offer(new pair(i, j - 1, t + 1));
            }
            if (j + 1 < m && vis[i][j + 1] == false && grid[i][j + 1] == 1) {
                q.offer(new pair(i, j + 1, t + 1));
                vis[i][j+1] = true;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && vis[i][j] == false)
                    return -1;
            }
        }
        return max;

    }
}