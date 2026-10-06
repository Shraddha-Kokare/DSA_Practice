class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        if(m==0 && n==0)
            return 1;

        int[][] dp=new int[m][n];
        for(int[] d:dp)
        {
            Arrays.fill(d,-1);
        }
        // dp[0][0]=1;
        // dp[m-1][n-1]=from(0,0,m,n,dp);

        return from(m-1,n-1,dp,obstacleGrid);
    }

    public int from(int r,int c,int[][] dp, int[][] obst)
    {
        
        if(r<0 || c<0 || (obst[r][c]==1))
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

        int right=from(r,c-1,dp,obst);
        int down=from(r-1,c,dp,obst);

        dp[r][c]=right+down;

        return dp[r][c];
    }
}