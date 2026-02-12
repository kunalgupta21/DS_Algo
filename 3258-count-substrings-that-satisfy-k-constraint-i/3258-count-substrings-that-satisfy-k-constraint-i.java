class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int n=s.length();
        int i=0,j=0;
        int c1=0,c0=0;
        int count=0;
        while(j<n){
            char ch=s.charAt(j);
            if(ch=='1') c1++;
            else c0++;

            while(c1>k && c0>k){
                if(s.charAt(i)=='0'){
                    c0--;
                }else{
                    c1--;
                }
                i++;
            }
            count+=j-i+1;
            j++;
        }
        return count;
    }
}