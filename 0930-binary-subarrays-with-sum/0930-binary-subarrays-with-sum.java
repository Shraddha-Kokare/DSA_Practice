class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return subArrayLessOrEqual(nums,goal)-subArrayLessOrEqual(nums,goal-1);
    }

    public int subArrayLessOrEqual(int[] nums, int goal)
    {
        int l=0,r=0;
        int n=nums.length;

        if(goal<0)
            return 0;

        int sum=0,count=0;

        while(r<n)
        {
            sum+=nums[r];
            while(sum>goal)
            {
                sum-=nums[l];
                l++;
            }
            count+=(r-l+1);
            r++;
        }

        return count;
    }
}