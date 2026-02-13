class Solution {
    public int maxConsecutiveAnswers(String s, int k) {
        int i=0,j=0;
        int n=s.length();
        int len=0;
        int cnt=0;
        while(j<n){
            if(s.charAt(j)=='F') cnt++;
            len=Math.max(len,j-i);
            while(cnt>k){
                if(s.charAt(i)=='F'){
                    cnt--;
                }
                i++;
            } 
            j++;
        }
        len=Math.max(len,j-i);
        i=0;j=0;
        cnt=0;
         while(j<n){
            if(s.charAt(j)=='T') cnt++;
            len=Math.max(len,j-i);
            while(cnt>k){
                if(s.charAt(i)=='T'){
                    cnt--;
                }
                i++;
            } 
            j++;
        }
        len=Math.max(len,j-i);
        return len;
    }
}