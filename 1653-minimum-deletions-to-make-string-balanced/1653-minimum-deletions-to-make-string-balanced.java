class Solution {
    public int minimumDeletions(String s) {
        int rightA = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a') rightA++;
        }

        int leftB = 0;
        int ans = Integer.MAX_VALUE;

        for (char c : s.toCharArray()) {
            ans = Math.min(ans, leftB + rightA);

            if (c == 'a') {
                rightA--;
            } else {
                leftB++;
            }
        }

        // ✅ consider split after the last character
        ans = Math.min(ans, leftB + rightA);

        return ans;
    }
}
