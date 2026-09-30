class Solution {
    public int totalFruit(int[] fruits) {
        // brute force - generate all subarrays, solve the problem as max length subarray with at most k fruits
        // better - two pointer and sliding window
        
        // optimal - with only 1 increment for l

        // by better approach
        int n=fruits.length;
        int maxLen=0;

        HashMap<Integer, Integer> mpp=new HashMap<>();
        int l=0,r=0;

        while(r<n)
        {
            int f=fruits[r];
            mpp.put(fruits[r],mpp.getOrDefault(fruits[r],0)+1);
            if(mpp.size()>2)
            {
                while(mpp.size()>2)
                {
                    mpp.put(fruits[l],mpp.get(fruits[l])-1);
                    if(mpp.get(fruits[l])==0)
                    {
                        mpp.remove(fruits[l]);
                    }
                    l++;
                }
            }

            if(mpp.size()<=2)
            {
                maxLen=Math.max(maxLen,r-l+1);
            }

            r++;
        }

        return maxLen;

    }
}