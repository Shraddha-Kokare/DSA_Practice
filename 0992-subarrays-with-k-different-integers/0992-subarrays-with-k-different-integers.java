class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostK(nums,k)-atMostK(nums,k-1);
    }
    public static int atMostK(int[] nums, int k)
    {
        if(k<=0)
        {
            return 0;
        }
        Map<Integer, Integer> mpp=new HashMap<>();
        int l=0,r=0,cnt=0;
        while(r<nums.length)
        {
            mpp.put(nums[r],mpp.getOrDefault(nums[r],0)+1);
            while(mpp.size()>k)
            {
                mpp.put(nums[l],mpp.get(nums[l])-1);
                if(mpp.get(nums[l])==0)
                {
                    mpp.remove(nums[l]);
                }
                l++;
            }

            if(mpp.size()<=k)
            {
                cnt+=(r-l+1);
            }
            r++;
        }

        return cnt;
    }
}