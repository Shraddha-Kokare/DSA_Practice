class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> mpp=new HashMap<>();
        int l=0,r=0;
        int n=s.length();
        int maxLen=-1;
        while(r<n)
        {
            char ch=s.charAt(r);
            if(mpp.containsKey(ch) && mpp.get(ch)>=l )
            {
                l=mpp.get(ch)+1;
                mpp.put(ch,r);
            }
            else{
                mpp.put(ch,r);
            }

            maxLen=Math.max(maxLen,r-l+1);
            
            r++;
        }

        return maxLen==-1?0:maxLen;
    }
}