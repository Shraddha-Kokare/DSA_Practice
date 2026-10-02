class Solution {
    public int minBitFlips(int start, int goal) {
        int ans=start^goal;
        // count no. of 1s in ans

        // using left shift to check if ith bit is set
        int cnt=0;
        // for(int i=0;i<32;i++)
        // {
        //     if((ans&(1<<i))!=0)
        //     {
        //         cnt++;
        //     }
        // }

        // by n & n-1 to get rid of last set bit
        while(ans!=0)
        {
            ans=ans&(ans-1);
            cnt++;
        }

        return cnt;
    }
}