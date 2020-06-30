class Solution {
    public int movingCount(int m, int n, int k) {
       boolean[][] visited=new boolean[m][n];
       return dfs(0,0,m,n,k,visited);
    }
    private int dfs(int x,int y,int m,int n,int k,boolean[][] visited){
        if(x<0 || x>m-1 || y<0 || y>n-1 || (x%10+x/10+y%10+y/10)>k || visited[x][y])
            return 0;
        visited[x][y]=true;
        return 1+dfs(x-1,y,m,n,k,visited)+dfs(x+1,y,m,n,k,visited)+dfs(x,y-1,m,n,k,visited)+dfs(x,y+1,m,n,k,visited);
    }
}
//把数组看作图，深度优先遍历