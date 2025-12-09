class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int n = mat.length, m = mat[0].length;

        // Build prefix sum
        int[][] ps = new int[n+1][m+1]; // Extra row and col to avoid boundary issues

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                ps[i][j] = mat[i-1][j-1]
                          + ps[i-1][j]
                          + ps[i][j-1]
                          - ps[i-1][j-1];
            }
        }

        int[][] ans = new int[n][m];

        // Compute block sum for each cell
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                int r1 = Math.max(0, i-k);
                int c1 = Math.max(0, j-k);
                int r2 = Math.min(n-1, i+k);
                int c2 = Math.min(m-1, j+k);

                // translate to prefix sum indexes (+1)
                r1++; c1++; r2++; c2++;

                ans[i][j] = ps[r2][c2]
                        - ps[r1-1][c2]
                        - ps[r2][c1-1]
                        + ps[r1-1][c1-1];
            }
        }
        return ans;
    }
}