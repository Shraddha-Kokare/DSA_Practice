class Solution {
    public int uniquePaths(int m, int n) {
        if(m==0 && n==0)
            return 1;

        int[][] dp=new int[m][n];
        for(int[] d:dp)
        {
            Arrays.fill(d,-1);
        }
        // dp[0][0]=1;
        // dp[m-1][n-1]=from(0,0,m,n,dp);

        return from(m-1,n-1,m,n,dp);
    }

    public int from(int r,int c,int m,int n,int[][] dp)
    {
        
        if(r<0 || c<0)
        {
            return 0;
        }

        if(dp[r][c]!=-1)
        {
            return dp[r][c];
        }

        if(r==0 && c==0)
        {
            dp[r][c]=1;
            return 1;
        }

        int right=from(r,c-1,m,n,dp);
        int down=from(r-1,c,m,n,dp);

        dp[r][c]=right+down;

        return dp[r][c];
    }
}