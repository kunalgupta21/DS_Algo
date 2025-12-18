class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        List<Integer> list=new ArrayList<>();
        int i=0;
        int j=0;
        Deque<Integer> dq=new ArrayDeque<>();
        while(j< arr.length){
            if(arr[j]<0) dq.addLast(arr[j]);
            if(j-i+1<k){
                j++;
            }else if(j-i+1==k){

                if(dq.isEmpty()) list.add(0);
                else {
                    list.add(dq.peekFirst());
                    if (dq.peekFirst() == arr[i]) {
                        dq.removeFirst();
                    }
                }
                i++;j++;
            }

        }
        return list;
    }}
    