class Solution {
    public int[][] floodFill(int[][] img, int sr, int sc, int color) {
        int n=img.length,m=img[0].length;
        


        boolean [][] vis=new boolean[n][m];


        int old=img[sr][sc];
        if(old==color)return img;
        
        help(img,sr,sc,color,old,vis,n,m);
        return img;
    }

    public void help(int[][] img,int i,int j,int col,int old,boolean[][] vis,int n,int m){

        if(i<0||i>=n||j<0||j>=m||vis[i][j]==true||old!=img[i][j])return;

        vis[i][j]=true;
        img[i][j]=col;
        help(img,i-1,j,col,old,vis,n,m);
        help(img,i+1,j,col,old,vis,n,m);
        help(img,i,j-1,col,old,vis,n,m);
        help(img,i,j+1,col,old,vis,n,m);
    }
}