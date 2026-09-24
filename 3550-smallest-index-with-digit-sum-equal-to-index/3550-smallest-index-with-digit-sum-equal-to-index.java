class Solution {
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            int curr=nums[i];

            while(curr>0)
            {
                int rem=curr%10;
                sum+=rem;
                curr=curr/10;
            }

            if(sum==i)
            {
                return i;
            }
        }

        return -1;
    }
}