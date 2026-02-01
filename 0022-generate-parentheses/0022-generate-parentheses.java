class Solution {
    public List<String> generateParenthesis(int n) {
         List<String> ans = new ArrayList<>();
        generate(ans, "", n, n);
        return ans;
    }

    private void generate(List<String> ans, String current, int open, int close) {
      if(open==0 && close==0) {
        ans.add(current);
        return;
      }
      if(close>open){
        if(open>0) generate(ans,current+'(',open-1,close);
        generate(ans,current+')',open,close-1);
      }else if(open>0){
        generate(ans,current+'(',open-1,close);
      }
      return;
    }
    
}