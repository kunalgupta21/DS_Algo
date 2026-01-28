class Solution {
    public int numIslands(char[][] grid) {
         int count=0;
        int n=grid.length;
        int m=grid[0].length;
        int[][] vis=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0 && grid[i][j]=='1'){
                    dfs(i,j,grid,vis);
                    count++;
                }
            }
        }
        return count;
    }
    private void dfs(int i,int j,char[][] grid,int[][] vis){
        vis[i][j]=1;
        int n=grid.length;
        int m=grid[0].length;
        int[] delrow={-1,0,0,1};
        int[] delcol={0,-1,1,0};
        for(int k=0;k<delrow.length;k++){
            int row=i+delrow[k];
            int col=j+delcol[k];
            if((row>=0 && row<n) &&(col>=0 && col<m) && grid[row][col]=='1' && vis[row][col]==0){
                        dfs(row,col,grid,vis);
            }
        }    
            
        
        
    }
}