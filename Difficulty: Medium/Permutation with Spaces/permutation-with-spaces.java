class Solution {

    ArrayList<String> permutation(String s) {
        ArrayList<String> ans = new ArrayList<>();
        per(1, s, "" + s.charAt(0), ans); // start with first char
        return ans;
    }

    void per(int index, String s, String temp, ArrayList<String> ans) {
        if (index == s.length()) {
            ans.add(temp);
            return;
        }

        // Option 1: add space before next character
        per(index + 1, s, temp + " " + s.charAt(index), ans);

        // Option 2: no space
        per(index + 1, s, temp + s.charAt(index), ans);
    }
}
