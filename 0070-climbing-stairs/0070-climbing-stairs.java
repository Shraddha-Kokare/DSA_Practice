class Solution {
    public int climbStairs(int n) {
        Map<Integer, Integer> mem=new HashMap<>();
        return climb(n,mem);
    }

    private int climb(int n, Map<Integer, Integer> mp)
    {
        if(n==0 || n==1)
            return 1;

        if(!mp.containsKey(n))
        {
            mp.put(n,climb(n-1,mp)+climb(n-2,mp));
        }

        return mp.get(n);
    }
}