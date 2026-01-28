class Solution {
    public int countIslands(char[][] grid) {
        // Code here
        int count=0;
        int n=grid.length;
        int m=grid[0].length;
        int[][] vis=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0 && grid[i][j]=='L'){
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
    
        for(int delrow=-1;delrow<=1;delrow++){
            for(int delcol=-1;delcol<=1;delcol++){
                    int row=i+delrow;
                    int col=j+delcol;
                    if((row>=0 && row<n) &&(col>=0 && col<m) && grid[row][col]=='L' && vis[row][col]==0){
                        dfs(row,col,grid,vis);
                    }
            }
        }
        
    }
    
    
    
    
    
    
    
    private void islands(int i,int j,char[][] grid,int[][] vis){
        
        vis[i][j]=1;
        Queue<int[]> que=new LinkedList<>();
        
        que.add(new int[]{i,j});
        
        int n=grid.length;
        int m=grid[0].length;
        
        while(!que.isEmpty()){
            
               int[] temp=que.poll();
                int st=temp[0];
                int end=temp[1];
                for(int delrow=-1;delrow<=1;delrow++){
                    for(int delcol=-1;delcol<=1;delcol++){
                        int row=st+delrow;
                        int col=end+delcol;
                        
                        if(row>=0 && row<n && col>=0 && col<m && vis[row][col]==0 && grid[row][col]=='L'){
                            vis[row][col]=1;
                            
                            que.add(new int[]{row,col});
                            
                        }
                    }
                }
            }    
        }
    
}