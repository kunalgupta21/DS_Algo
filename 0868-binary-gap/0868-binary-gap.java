class Solution {
    public int binaryGap(int n) {
        int k=n>>1;
        int c=1;
        int max=0;
        while(k>0){
            if((n&1)!=1){
                n=n>>1;
                k=k>>1;
            }//1100101000000
            else if(((n&1)==1) && (k&1)!=1){
                k=k>>1;
                c++;
            }
            else if(((k&1)==1) && ((n&1)==1)){
                // c++;
                max=Math.max(max,c);
                c=1;
                n=k;
                k=k>>1;
                // n=n>>1;
            }
        }
        return max;
    }
}