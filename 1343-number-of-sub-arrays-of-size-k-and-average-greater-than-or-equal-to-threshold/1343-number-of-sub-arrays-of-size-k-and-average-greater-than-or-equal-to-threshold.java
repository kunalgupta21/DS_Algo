class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i=0,j=0;
        int count=0;
        int sum=0;
        while(j<arr.length){
            sum+=arr[j];
            int size=j-i+1;
            if(size==k){
                if((sum/size)>=threshold){
                    count++;
                }
                sum-=arr[i];
                i++;
            }
            j++;
        }
        return count;
    }
}