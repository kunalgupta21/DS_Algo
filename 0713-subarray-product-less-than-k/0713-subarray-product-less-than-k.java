class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int cnt=0;
        if(k==0||k==1) return 0;
        int i=0,j=0;
        int n=nums.length;
        int pdt=1;
        while(j<n){
            pdt*=nums[j];
            while(i<n && pdt>=k){
                pdt=pdt/nums[i];
                i++;
            }
            if(pdt<k) cnt+=j-i+1;
            j++;
        }
        return cnt;
    }
}