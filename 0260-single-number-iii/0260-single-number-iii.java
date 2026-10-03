class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int num:nums)
        {
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        int[] ans=new int[2];
        int ind=0;
        for(Map.Entry<Integer,Integer> entry:freq.entrySet())
        {
            if(entry.getValue()==1)
            {
                ans[ind++]=entry.getKey();
            }
        }
        Arrays.sort(ans);

        return ans;
    }
}