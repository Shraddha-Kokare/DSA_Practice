class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0)
            return 0;
        if(n==1)
            return nums[0];

        int[] arr1=new int[n-1];
        int[] arr2=new int[n-1];

        for(int i=0;i<n;i++)
        {
            if(i!=n-1)
            {
                arr1[i]=nums[i];
            }
            if(i!=0)
            {
                arr2[i-1]=nums[i];
            }
        }

        int ans1=maxNonAdj(arr1);
        int ans2=maxNonAdj(arr2);

        return Math.max(ans1,ans2);
    }
    public int maxNonAdj(int[] nums) {
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