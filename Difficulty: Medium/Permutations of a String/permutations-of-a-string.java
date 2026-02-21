class Solution {
    public ArrayList<String> findPermutation(String s) {
        // Code here
        ArrayList<String> ans=new ArrayList<>();
        StringBuilder s1=new StringBuilder(s);
        StringBuilder temp=new StringBuilder();
       
        permute(s1,temp,ans);
        return ans;
    }
     static void permute(StringBuilder remaining, StringBuilder current,ArrayList<String> ans) {

        if (remaining.length() == 0) {
            ans.add(current.toString());
            return;
        }

        HashSet<Character> usedAtLevel = new HashSet<>();

        for (int i = 0; i < remaining.length(); i++) {

            char ch = remaining.charAt(i);

            // Skip duplicate choice at same level
            if (usedAtLevel.contains(ch)) continue;

            usedAtLevel.add(ch);

            // MAKE CHOICE
            current.append(ch);
            remaining.deleteCharAt(i);

            // EXPLORE
            permute(remaining, current,ans);

            // BACKTRACK (UNDO BOTH)
            remaining.insert(i, ch);
            current.deleteCharAt(current.length() - 1);
        }
    }
}