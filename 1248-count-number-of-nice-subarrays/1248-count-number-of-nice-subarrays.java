class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return countSumLessOrEqual(nums,k)-countSumLessOrEqual(nums,k-1);
    }

    public static int countSumLessOrEqual(int[] nums, int k)
    {
        if(k<0)
        {
            return 0;
        }
        int cnt=0;
        int l=0;
        int sum=0;
        for(int r=0;r<nums.length;r++)
        {
            sum+=nums[r]%2;

            while(sum>k)
            {
                if(nums[l]%2==1) sum--;
                
                l++;
            }
            cnt+=(r-l+1);
        }

        return cnt;
    }
}