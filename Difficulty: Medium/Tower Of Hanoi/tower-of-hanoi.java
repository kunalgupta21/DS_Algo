class Solution {
    public int towerOfHanoi(int n, int s, int d, int h) {
      
        int[] ans={0};
        towerHanoi(n,s,d,h,ans);
        return ans[0];
    }
    public void towerHanoi(int n, int s, int d, int h,int[] count) {
        // code here
        if(n==1){
            ++count[0];
            return;
        }
        towerHanoi(n-1,s,h,d,count);
        count[0]++;
        towerHanoi(n-1,h,d,s,count);
        return;
    }
    
}
