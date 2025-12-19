class Solution {
    public boolean check(int[] arr) {
      int st=0;
      int end=arr.length-1;
      int n=arr.length;
      int c=0;
      for(int i=0;i<n;i++){
        if(arr[i]>arr[(i+1)%n]){
            c++;
        }
      }
      return c<=1;

    }
}