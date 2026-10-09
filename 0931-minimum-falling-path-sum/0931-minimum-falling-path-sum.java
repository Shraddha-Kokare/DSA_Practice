class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int mini=Integer.MAX_VALUE;
        int[][] dp=new int[n][n];
        for(int[] curr:dp)
            Arrays.fill(curr,Integer.MAX_VALUE);
        for(int i=0;i<n;i++)
        {
            mini=Math.min(mini,func(0,i,matrix,dp));
        }

        return mini;
    }

    public int func(int r,int c,int[][] matrix,int[][] dp)
    {
        int n=matrix.length;
        if(c<0 || c>=n)
        {
            return Integer.MAX_VALUE;
        }
        if(r==n-1)
        {
            return matrix[r][c];
        }

        if(dp[r][c]!=Integer.MAX_VALUE)
            return dp[r][c];

        int left=func(r+1,c-1,matrix,dp);
        int down=func(r+1,c, matrix,dp);
        int right=func(r+1,c+1,matrix,dp);

        dp[r][c]=matrix[r][c]+Math.min(left,Math.min(down,right));

        return dp[r][c];
    }
}