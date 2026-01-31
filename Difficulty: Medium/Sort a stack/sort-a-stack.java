class Solution {
    public void sortStack(Stack<Integer> st) {
        // code here
        if(st.size()==1){
            return;
        }
        
        int temp=st.pop();
        sortStack(st);
        insert(st,temp);
    }
    
    private void insert(Stack<Integer> st,int temp){
        if(st.isEmpty() || st.peek()<=temp){
            st.push(temp);
            return;
        }
        
        int val=st.pop();
        insert(st,temp);
        st.push(val);
    }
}