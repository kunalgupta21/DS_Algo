class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int n=boxGrid.length; int m=boxGrid[0].length;
        // if(m==1) return boxGrid;
        char[][] tran=new char[m][n];
        for(int i=0;i<n;i++){
            for(int j=m-1;j>=0;j--){
                if(boxGrid[i][j]=='#'){
                    int k=j+1;
                    while(k<m && boxGrid[i][k]=='.' && boxGrid[i][j]=='#'){
                        char temp=boxGrid[i][j];
                        boxGrid[i][j]=boxGrid[i][k];
                        boxGrid[i][k]=temp;
                        k++;
                        j++;
                    }
                }
            }
        }
        
        
        
        
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                tran[j][n-i-1]=boxGrid[i][j];
            }
        }

        
        return tran;

    }
}
// . 
// .
// . 
// .
// . 
// .
// . 
// .
// . 
// #
