class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
            int n=nums.length;
            if(n<3) return 0;
            int i=0,j=1;
            int cnt=0;
            int temp=0;
            while(j<n-1){
                if(nums[j]-nums[j-1]==nums[j+1]-nums[j]){
                                       j++;
                                       temp++;
                                       cnt+=temp;
                    
                }else{
                    j++;
                    temp=0;
                }
            }
            return cnt;
    }
}