class Solution {
    public int longestOnes(int[] nums, int k) {
        int cnt=0;
        int len=0;
        int i=0,j=0;
        int n=nums.length;
        while(j<n){
            if(nums[j]==0) cnt++;
            if(cnt<=k) len=Math.max(len,j-i+1);
            while(cnt>k){
                if(nums[i]==0) cnt--;
                i++;
            }
            j++;
        }
        return len;
    }
}