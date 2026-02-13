class Solution {
    public long getDescentPeriods(int[] prices) {
        long len=0;
        long cnt=1;
        int i=0,j=1;
        int n=prices.length;
        while(j<n){
            if(prices[j]==prices[j-1]-1){
                cnt+=j-i+1;
            }
            else{
                cnt++;
                i=j;

            }
            j++;
        }
        return cnt;
    }
}