class Solution {
    public int findCircleNum(int[][] mat) {
        List<List<Integer>> adj=new ArrayList<>();
        int n=mat.length;
        int m=mat[0].length;

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    adj.get(i).add(j);
                }
            }
        }


        int[] vis=new int[n];

        int cnt=0;


        for(int i=0;i<n;i++){
            if(vis[i]==0){
                cnt++;
                dfs(i,vis,adj);
            }

        }
        return cnt;
        
    }
    private void dfs(int node,int[]vis, List<List<Integer>> adj){
        vis[node]=1;

        for(int i:adj.get(node)){
            if(vis[i]==0)
                dfs(i,vis,adj);
        }
    }
}