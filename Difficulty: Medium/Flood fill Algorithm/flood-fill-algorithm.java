class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // code here
        int n=image.length;
        int m=image[0].length;
        boolean[][] vis=new boolean[n][m];
        int orig=image[sr][sc];
        dfs(sr,sc,newColor,image,vis,orig);
        return image;
        
    }
    public void dfs(int i,int j,int newColor,int[][] image,boolean[][] vis,int orig){
        vis[i][j]=true;
        image[i][j]=newColor;
        int n=image.length;
        int m=image[0].length;
        
        int[] delrow={-1,0,0,1};
        int[] delcol={0,-1,1,0};
        for(int k=0;k<4;k++){
            int row=i+delrow[k];
            int col=j+delcol[k];
            if(row>=0 && row<n && col>=0 && col<m && !vis[row][col] && image[row][col]==orig){
                dfs(row,col,newColor,image,vis,orig);
            }
        }
    }
}