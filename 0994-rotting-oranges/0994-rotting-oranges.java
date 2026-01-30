class Solution {
    public int orangesRotting(int[][] mat) {
         // code here
        int cntfresh=0;
        int n=mat.length;
        int m=mat[0].length;
        int[][] vis=new int[n][m];
        Queue<int[]> que=new ArrayDeque<>();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==2){
                    vis[i][j]=2;
                    que.add(new int[]{i,j,0});
                }
                if(mat[i][j]==1) cntfresh++;
            }
        }
        int[] drow={-1,0,0,1};
        int[] dcol={0,-1,1,0};
        int cnt=0;
        int mxt=0;
        while(!que.isEmpty()){
            int[] temp=que.poll();
            int st=temp[0],end=temp[1],t=temp[2];
            mxt=Math.max(mxt,t);
            for(int k=0;k<4;k++){
                int row=st+drow[k];
                int col=end+dcol[k];
                if(row>=0 && row<n && col>=0 && col<m && vis[row][col]!=2 && mat[row][col]==1){
                    vis[row][col]=2;
                    que.add(new int[]{row,col,t+1});
                    cnt++;
                }
            }
            
        }
        if(cnt!=cntfresh) return -1;
        return mxt;
        
    }
}