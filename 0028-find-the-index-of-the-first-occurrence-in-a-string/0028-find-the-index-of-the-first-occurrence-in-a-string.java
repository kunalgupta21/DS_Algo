class Solution {
    public int strStr(String txt, String pat) {
        int M=pat.length();
        int N=txt.length();
        int[] lps=new int[M];
        computelps(pat,lps,M);
        int i=0,j=0;
        while(i<N){
            if(txt.charAt(i)==pat.charAt(j)){
                i++;
                j++;
            }
            if(j==M){
                return i-j;
            }
            if(i<N && txt.charAt(i)!=pat.charAt(j)){
                if(j!=0) j=lps[j-1];
                else i++;

            }
        }
        return -1;

        

    }
    private void computelps(String pat,int[] lps,int M){
        int length=0;
        lps[0]=0;
        int i=1;
        while(i<M){
            if(pat.charAt(i)==pat.charAt(length)){
                length++;
                lps[i]=length;
                i++;
            }else{
                if(length!=0) length=lps[length-1];
                else i++;
            }
        }
    }
}