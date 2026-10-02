class Solution {
    public int minBitFlips(int start, int goal) {
        int ans=start^goal;
        // count no. of 1s in ans
        int cnt=0;
        for(int i=0;i<32;i++)
        {
            if((ans&(1<<i))!=0)
            {
                cnt++;
            }
        }
        return cnt;
    }
}