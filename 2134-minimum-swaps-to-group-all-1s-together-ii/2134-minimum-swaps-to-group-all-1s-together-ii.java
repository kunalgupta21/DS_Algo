class Solution {
    public int minSwaps(int[] nums) {
        int k=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==1) k++;
        }
        if(k==0) return 0;
        int i=0,j=0;
        int cnt=0,ans=n;
        while(j<n+k){
            if(nums[j%n]==0) cnt++;
        
        if(j-i+1==k){
            ans=Math.min(ans,cnt);
            if(nums[i%n]==0) cnt--;
            i++;
        }
        j++;
        }
        return ans;

    }
}