class Solution {
    int[][] mark;
    public boolean exist(char[][] board, String word) {
        int m=board.length,n=board[0].length;
        mark=new int[m][n];
        int k=0;
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                if(board[i][j]==word.charAt(0) && getTrace(board,word,i,j,k))
                    return true;
        return false;
    }
    public boolean getTrace(char[][] board,String word,int i,int j,int k){
        mark[i][j]=1;
        if(k==word.length()-1)
            return true;
        char c=word.charAt(++k);
        if(i>0 && board[i-1][j]==c && mark[i-1][j]==0 && getTrace(board,word,i-1,j,k))
            return true;
        if(j>0 && board[i][j-1]==c && mark[i][j-1]==0 && getTrace(board,word,i,j-1,k))
            return true;
        if(i+1<board.length && board[i+1][j]==c && mark[i+1][j]==0 && getTrace(board,word,i+1,j,k))
            return true;
        if(j+1<board[0].length && board[i][j+1]==c && mark[i][j+1]==0 && getTrace(board,word,i,j+1,k))
            return true;
        mark[i][j]=0;
        return false;
    }
}
//回溯法:在递归中先做标记，后做处理，处理若失败取消标记（相当于回溯）