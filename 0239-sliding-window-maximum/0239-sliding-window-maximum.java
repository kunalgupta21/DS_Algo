class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int i=0,j=0;
        ArrayList<Integer> list=new ArrayList<>();
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        while(j<arr.length){
            while(!dq.isEmpty() && (arr[dq.peekLast()]<arr[j])){
                dq.removeLast();
            }
            dq.addLast(j);
            if(j-i+1<k){
                j++;
            }else if(j-i+1==k){
                list.add(arr[dq.peekFirst()]);
                if(arr[dq.peekFirst()]==arr[i]) dq.removeFirst();
                i++;j++;
            }
        }
        int[] ans=new int[list.size()];
        for(int p=0;p<list.size();p++){
            ans[p]=list.get(p);
        }
        return ans;
    }
    
   
}