class Solution {
    public int[] searchRange(int[] arr, int target) {
        return new int[]{firstoccurence(arr,target),lastoccurence(arr,target)};
    }
      private static int firstoccurence(int[] arr, int x) {
        int st=0;
        int end=arr.length-1;
        int ind=-1;
        while (st<=end){
            int mid=st+(end-st)/2;
            if (arr[mid]==x){
                ind=mid;
                end=mid-1;
            }
            else if (arr[mid]>x){

                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        return ind;
    }
    private static int lastoccurence(int[] arr, int x) {
        int st=0;
        int end=arr.length-1;
        int ind=-1;
        while (st<=end){
            int mid=st+(end-st)/2;
            if (arr[mid]==x){
                ind=mid;
                st=mid+1;
            }
            else if (arr[mid]>x){

                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        return ind;
    }
}
