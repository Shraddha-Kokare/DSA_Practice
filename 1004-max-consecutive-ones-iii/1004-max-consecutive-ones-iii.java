class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int maxLen=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int countZero=0;
            for(int j=i;j<n;j++)
            {
                if(nums[j]==0)
                {
                    countZero++;
                }

                if(countZero<=k)
                {
                    int len=j-i+1;
                    maxLen=Math.max(maxLen,len);
                }
                else{
                    break;
                }
            }
        }

        return maxLen==Integer.MIN_VALUE?0:maxLen;
    }
}