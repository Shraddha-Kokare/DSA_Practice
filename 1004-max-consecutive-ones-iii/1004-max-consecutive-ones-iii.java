class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int zeroes=0;
        int l=0,r=0,maxLen=Integer.MIN_VALUE;

        while(r<n)
        {
            if(nums[r]==0)
            {
                zeroes++;
            }
            if(zeroes>k)
            {
                if(nums[l]==0)
                {
                    zeroes--;
                }
                l++;
            }
            if(zeroes<=k)
            {
                int len=r-l+1;
                maxLen=Math.max(maxLen,len);
            }
            r++;
        }

        return maxLen==Integer.MIN_VALUE?0:maxLen;
    }
}