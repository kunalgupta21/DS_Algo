// User function Template for Java
class Solution {
    public int findTarget(int arr[], int target) {
        // code here
        int st=0;int end=arr.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==target) return mid;
            else if(mid+1<=end && arr[mid+1]==target) return mid+1;
            else if(mid-1>=st && arr[mid-1]==target) return mid-1;
            else if(arr[mid]>target){
                end=mid-2;
            }else{
                st=mid+2;
            }
        }
        return -1;
    }
}