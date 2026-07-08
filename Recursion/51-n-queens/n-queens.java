class Solution {
    List<List<String>> ans=new ArrayList<>();
    public boolean isSafe(char[][] board,int row,int col,int n){
        for(int i=0;i<n;i++){
            if(board[row][i]=='Q')
                return false;

        }
        for(int i=0;i<n;i++){
            if(board[i][col]=='Q')
                return false;
                
        }

        for(int i=row-1, j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q')return false;

        }
        for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++){
            if(board[i][j]=='Q')return false;
            
        }
        return true;
    }

    public void help(char[][] board,int row,int n){
        if(row==n){
                List<String> temp=new ArrayList<>();
                for(char[] ch:board){
                    temp.add(new String(ch));
                }

                ans.add(temp);
                return;

        }

        for(int j=0;j<n;j++){
            if(isSafe(board,row,j,n)){
                board[row][j]='Q';
                help(board,row+1,n);
                board[row][j]='.';
                           }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        char[][] board=new char [n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        help(board,0,n);
        return ans;

        
    }
}