class Solution {
    public int[] decrypt(int[] nums, int k) {
        int n=nums.length;
        int[] dec=new int[n];
        if(k>0){
            for(int i=0;i<n;i++){
                int sum=0;
                for(int j=i+1;j<i+1+k;j++){
                    sum+=nums[j%n];
                }
                dec[i]=sum;
            }
        }else if(k<0){
             for(int i=0;i<n;i++){
                int sum=0;
                for(int j=n+i-1;j>n+i-1+k;j--){
                    sum+=nums[j%n];
                }
                dec[i]=sum;
            }
        }
        return dec;
    }
}