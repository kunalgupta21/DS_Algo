class Solution {
    public int minOperations(int[] nums) {
       int i=0;
       int count=0;
       while(i<nums.length-2){
            if(nums[i]==0){
                count++;
                for(int j=i;j<i+3;j++){
                    nums[j]=(nums[j]==0)?1:0;
                }
            }
            i++;
       }   
       for(int num:nums){
        if(num==0) return -1;
       }
       return count;
    }
}