class Solution {
    public int longestSubarray(int[] nums) {
        int len=0;
        int n=nums.length;
        int i=0,j=0;
        int cnt=0;
        while(j<n){
            if(nums[j]==0) cnt++;
            if(cnt<=1) len=Math.max(len,j-i);
            while(cnt>1){
                if(nums[i]==0){
                     
                    cnt--;
                }
                i++;
            }
            j++;
        }
        return len;
       
    }
}