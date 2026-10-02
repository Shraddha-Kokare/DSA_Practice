class Solution {
    public int lengthOfLongestSubstring(String s) {
       
        int n=s.length();
        int maxLen=Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            int[] freq=new int[256];
            for(int j=i;j<n;j++)
            {
                if(freq[s.charAt(j)]==1)
                {
                    break;
                }
                int len=j-i+1;
                freq[s.charAt(j)]=1;
                
                maxLen=Math.max(maxLen,len);
            }
        }

        return maxLen==Integer.MIN_VALUE?0:maxLen;
    }
}