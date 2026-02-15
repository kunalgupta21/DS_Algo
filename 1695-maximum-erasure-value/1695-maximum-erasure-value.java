class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        // int len=0;
        int maxsum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0,j=0;
        int n=nums.length;
        int sum=0;
        while(j<n){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            sum+=nums[j];
            if(map.size()==j-i+1){
                maxsum=Math.max(maxsum,sum);
            }else{
                while(map.size()<j-i+1){
                    map.put(nums[i],map.get(nums[i])-1);
                    if(map.get(nums[i])==0) map.remove(nums[i]);
                    sum-=nums[i];
                    i++;
                }
            }
            j++;
        }
        return maxsum;

    }
}