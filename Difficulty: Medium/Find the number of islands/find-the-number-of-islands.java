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
                    islands(i,j,grid,vis);
                    count++;
                }
            }
        }
        return count;
        
    }
    private void islands(int i,int j,char[][] grid,int[][] vis){
        
        vis[i][j]=1;
        Queue<List<Integer>> que=new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        list.add(i);
        list.add(j);
        que.add(list);
        
        int n=grid.length;
        int m=grid[0].length;
        
        while(!que.isEmpty()){
            
                List<Integer> temp=que.poll();
                int st=temp.get(0);
                int end=temp.get(1);
                for(int delrow=-1;delrow<=1;delrow++){
                    for(int delcol=-1;delcol<=1;delcol++){
                        int row=st+delrow;
                        int col=end+delcol;
                        
                        if(row>=0 && row<n && col>=0 && col<m && vis[row][col]==0 && grid[row][col]=='L'){
                            vis[row][col]=1;
                            List<Integer> tt = new ArrayList<>();
                            tt.add(row);
                            tt.add(col);
                            que.add(tt);
                            
                        }
                    }
                }
            }    
        }
    
}