class Solution {
    public int countPrimes(int n) {
        if(n<=2)
            return 0;

        boolean[] isCompo= new boolean[n];
        for(int i=2;i*i<n;i++)
        {
            if(!isCompo[i])
            {
                for(int j=i*i;j<n;j+=i)
                    isCompo[j]=true;
            }
        }

        int count=0;
        for(int i=2;i<n;i++)
        {
            if(!isCompo[i])
            {
                count++;
            }
        }

        return count;
    }
}