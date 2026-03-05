class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        per(nums,0,list);
        return list;
    }
    void per(int[] nums,int index,List<List<Integer>> list){
        if(index==nums.length){
            List<Integer> temp = new ArrayList<>();
            for(int num : nums){
                temp.add(num);
            }
            list.add(temp);
            return;
        }
        Set<Integer> set=new HashSet<>();
        for(int i=index;i<nums.length;i++){
            if(set.contains(nums[i])) continue;
            set.add(nums[i]);
            swap(nums,i,index);
            per(nums,index+1,list);
            swap(nums,i,index);//backtrack
        }
        return;
    }
    void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}