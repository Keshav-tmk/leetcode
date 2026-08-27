class Solution {
    class pair {
        int i;
        int j;
        int step;

        pair(int i, int j, int step) {
            this.i = i;
            this.j = j;
            this.step = step;
        }
    }

    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        boolean[][] vis = new boolean[n][m];
        Queue<pair> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    q.offer(new pair(i,j,0));
                    vis[i][j] = true;
                } else
                    vis[i][j] = false;
            }
        }

        int[] row = { -1, 0, 1, 0 };
        int[] col = { 0, 1, 0, -1 };

        while (!q.isEmpty()) {
            pair curr = q.poll();

            int i = curr.i;
            int j = curr.j;
            int step = curr.step;
            mat[i][j]=step;
            for (int x = 0; x < 4; x++) {
                int r = i + row[x];
                int c = j + col[x];

                if(r>=0 && r<n && c>=0 && c<m && vis[r][c]==false){
                    vis[r][c]=true;
                    q.offer(new pair(r,c,step+1));
                    }

            }

        }
        return mat;

    }
}