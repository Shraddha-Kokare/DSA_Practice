class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int ans=0;

        for(int b=0;b<32;b++)
        {
            int count=0;
            for(int i=0;i<n;i++)
            {
                if((nums[i]&(1<<b))!=0)
                {
                    count++;
                }
            }

            if(count%3!=0)
            {
                ans|=(1<<b);
            }
        }

        return ans;
    }
}