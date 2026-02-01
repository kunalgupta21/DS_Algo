class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans=new ArrayList<>();

        cases(s,"",0,ans);
        return ans;
    }
    public void cases(String s, String op,int n,List<String> ans){
        if(n>=s.length()){
            ans.add(op);
            return;
        }
        char ch=s.charAt(n);
        if(Character.isDigit(ch)){
            op=op+ch;
            cases(s,op,n+1,ans);
        }
        else{
            char temp=(Character.isUpperCase(ch))?Character.toLowerCase(ch):ch;
            String op1=op+temp;
            String op2=op+Character.toUpperCase(temp);
            cases(s,op1,n+1,ans);
            cases(s,op2,n+1,ans);
        }
        return;
    }
}