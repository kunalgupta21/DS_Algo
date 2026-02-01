class Solution {
    public int minimumCost(int[] nums) {
        int fir=nums[0];
        Arrays.sort(nums);
        int ans=fir+nums[0]+nums[1];
        if(fir==nums[0]){
            ans-=nums[0];
            ans+=nums[2];
        }else if(fir==nums[1]){
               ans-=nums[1];
            ans+=nums[2];
        }
        return ans;
    }
}