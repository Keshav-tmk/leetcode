class Solution {
    List<List<String>>ans=new ArrayList<>();

    public boolean isSafe(char[][] b,int r,int c,int n){

        for(int i=0;i<n;i++){
            if(b[i][c]=='Q')return false;

        }
        for(int i=r-1,j=c-1;i>=0&&j>=0;i--,j--){
            if(b[i][j]=='Q')return false;

        }
        for(int i=r-1,j=c+1;i>=0&&j<n;i--,j++){
            if(b[i][j]=='Q')return false;
            
        }return true;
    }

    public void help(char b[][],int row,int n){
        if(row==n){
            List<String> temp=new ArrayList<>();
            for(char[] r: b){
                temp.add(new String(r));

            }
            ans.add(temp);
            return;
        }
        for(int j=0;j<n;j++){
        if(isSafe(b,row,j,n)){
            b[row][j]='Q';
            help(b,row+1,n);
            b[row][j]='.';
        }
    }

    }

    public List<List<String>> solveNQueens(int n) {
        char [][] b=new char[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                b[i][j]='.';
            }
        }
        help(b,0,n);
        return ans;

        
        
    }
}