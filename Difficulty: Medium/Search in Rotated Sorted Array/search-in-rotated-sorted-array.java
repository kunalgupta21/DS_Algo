class Solution {
    int search(int[] arr, int key) {
        // code here
        int ind=sountofroatated(arr);
        return Math.max(bs(arr,0,ind-1,key),bs(arr,ind,arr.length-1,key));
       
    }
    public static int bs(int[] arr,int st,int end, int target) {
        int left = st, right = end;
        while (left <= right) {
                int mid = left + (right - left) / 2; // Prevents overflow
                if (arr[mid] == target) return mid;
                else if (arr[mid] < target) left = mid + 1;
                else right = mid - 1;
        }
        return -1; // Not found
    }
    public static int sountofroatated(int[] arr) {
        int st=0;
        int end=arr.length-1;
        int n=arr.length;
        while (st<=end){
            int mid=st+(end-st)/2;
            if ((arr[mid]<arr[(mid+1)%n])&&(arr[mid]<arr[(mid+n-1)%n])){
                return mid;
            }
            else if(arr[mid]>arr[end]){
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}