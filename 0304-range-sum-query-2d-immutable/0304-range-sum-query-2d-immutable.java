class NumMatrix {
    int[][] prefix;
    public NumMatrix(int[][] matrix) {
        prefix=new int[matrix.length][matrix[0].length];
        
        for(int i=0;i<matrix.length;i++){
            int rows=0;
            for(int j=0;j<matrix[0].length;j++){
                rows+=matrix[i][j];
                prefix[i][j]=rows;
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int ans=0;
        for(int i=row1;i<=row2;i++){
            ans+=(col1==0)?prefix[i][col2]:prefix[i][col2]-prefix[i][col1-1];
        }
        return ans;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */