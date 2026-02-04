class Solution {
    public boolean isTrionic(int[] arr) {
        int i=1;
        int p=-1;
        int q=-1;
        int n=arr.length;
        while( i<n && arr[i]>arr[i-1]){
            i++;
        }
        p=i-1;
        while(i<n && arr[i]<arr[i-1]){
            i++;
        }
        q=i-1;
        while(i<n && arr[i]>arr[i-1]){
            i++;
        }
        if(p==0 || p==arr.length-1||q==arr.length-1||i!=arr.length||p>=q) return false;
        return true;
    }
}