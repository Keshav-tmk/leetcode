class Solution {
    public int kthSmallest(int[][] mat, int k) {

        int n=mat.length;
        int m=mat[0].length;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                pq.add(mat[i][j]);
            }
        }
        while(k--!=1)pq.remove();

        return pq.peek();
        
    }
}