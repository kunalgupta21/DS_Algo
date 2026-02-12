class Solution {
    public int countKConstraintSubstrings(String a, int k) {
    //    ArrayList<String> arr=new ArrayList<>();
    //    substring(a,"",arr,0);
       int count=0;
        for(int i=0;i<a.length();i++){
            for(int j=i;j<a.length();j++){
                 if(isValid(a.substring(i,j+1),k)){
                    count++;
                }
            }
        }
       
       
       return count;
    }
   
    public boolean isValid(String str,int k){
        int c1=0,c0=0;
        for(char ch:str.toCharArray()){
            if(ch=='1') c1++;
            else c0++;
        }
        if(c1<=k || c0<=k) return true;
        return false;

    }

}