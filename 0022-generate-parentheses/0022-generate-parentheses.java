class Solution {
    public List<String> generateParenthesis(int n) {
         List<String> ans = new ArrayList<>();
        generate(ans, "", n, n);
        return ans;
    }

    private void generate(List<String> ans, String current, int open, int close) {
        // Base case: if no parentheses remain, add the string to the result
        if (open == 0 && close == 0) {
            ans.add(current);
            return;
        }

        // Add an open parenthesis if there are remaining open ones
        if (open > 0) {
            generate(ans, current + "(", open - 1, close);
        }

        // Add a close parenthesis if it maintains balance
        if (close > open) {
            generate(ans, current + ")", open, close - 1);
        }
    }
    
}