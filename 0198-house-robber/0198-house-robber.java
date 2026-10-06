class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        // int[] dp=new int[n];
        // return func(n-1,nums,dp);
        // dp[0]=0;
        int curi=0;
        int prev=nums[0],prev2=0;
        for(int i=1;i<n;i++)
        {
            int take=nums[i];
            if(i>1)
            {
                take+=prev2;
            }
            int non_take=0+prev;

            curi=Math.max(take,non_take);

            prev2=prev;
            prev=curi;
        }

        return prev;
    }
    
}