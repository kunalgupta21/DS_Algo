class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int j=binarylast(arr,target);
        int i=binaryfirst(arr,target);
        if(i==-1 || j==-1) return 0;
        return j-i+1;
    }
      public int binaryfirst(int arr[],int x){
        int start=0,end=arr.length-1,ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==x){
                ans=mid;
                end=mid-1;
            }else if(arr[mid]>x){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
    public int binarylast(int arr[],int x){
        int start=0,end=arr.length-1,ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==x){
                ans=mid;
                start=mid+1;
            }else if(arr[mid]>x){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
}
