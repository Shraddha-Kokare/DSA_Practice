class Solution {
    public int uniquePaths(int m, int n) {

        int[][] dp = new int[m][n];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return from(m - 1, n - 1, dp);
    }

    private int from(int r, int c, int[][] dp) {

        // Outside the grid
        if (r < 0 || c < 0) {
            return 0;
        }

        // Starting cell
        if (r == 0 || c == 0) {
            return 1;
        }

        // Already calculated
        if (dp[r][c] != -1) {
            return dp[r][c];
        }

        int left = from(r, c - 1, dp);
        int up = from(r - 1, c, dp);

        dp[r][c] = left + up;

        return dp[r][c];
    }
}