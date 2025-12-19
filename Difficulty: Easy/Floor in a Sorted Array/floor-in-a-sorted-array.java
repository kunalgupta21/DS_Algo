class Solution {
    public int findFloor(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            
           if(nums[mid]>target){
               
                high=mid-1;
            }else{
                ans=mid;
                low=mid+1;
            }
        }
        return ans;
    }
}