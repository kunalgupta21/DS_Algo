class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        // code here
        int n=s.size();
        int sze=((n+1)%2==0)?(n+1)/2:(n+1)/2+1;
        
        dlt(s,sze);
    }
    void dlt(Stack<Integer> s,int sze){
        if(sze==1){
            s.pop();
            return;
        }
        int temp=s.pop();
        dlt(s,sze-1);
        s.push(temp);
    }
}