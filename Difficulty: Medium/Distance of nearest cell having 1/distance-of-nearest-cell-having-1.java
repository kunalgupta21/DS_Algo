class Solution {
    public ArrayList<ArrayList<Integer>> nearest(int[][] grid) {
        // code here
         int n=grid.length;
         int m=grid[0].length;
         boolean[][] vis=new boolean[n][m];
         int[][] dis=new int[n][m];
         Queue<int[]> que=new ArrayDeque<>();
         for(int i=0;i<n;i++){
             for(int j=0;j<m;j++){
                 if(grid[i][j]==1){
                     vis[i][j]=true;
                     que.add(new int[]{i,j,0});
                 }
             }
         }
         
         int[] drow={-1,0,0,1};
         int[] dcol={0,-1,1,0};
         
         while(!que.isEmpty()){
             int[] temp=que.poll();
             int rr=temp[0];
             int cc=temp[1];
             int step=temp[2];
             dis[rr][cc]=step;
             for(int k=0;k<4;k++){
                 int row=rr+drow[k];
                 int col=cc+dcol[k];
                 if(row>=0 && row<n && col>=0 && col<m &&
                 !vis[row][col] && grid[row][col]==0){
                     que.add(new int[]{row,col,step+1});
                     vis[row][col]=true;
                 }
             }
         }
         ArrayList<ArrayList<Integer>> list = new ArrayList<>();

            for (int i = 0; i <n; i++) {
                    ArrayList<Integer> row = new ArrayList<>();
                    for (int j = 0; j <m; j++) {
                        row.add(dis[i][j]);
                    }
                    list.add(row);
            }
            
        return list;    
    }
    
}
