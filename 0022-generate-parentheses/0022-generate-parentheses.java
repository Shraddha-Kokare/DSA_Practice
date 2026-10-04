class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        func(n,0,0,"",res);
        return res;
    }

    public void func(int n, int open, int close, String curr, List<String> res)
    {
        if(curr.length()==n*2)
        {
            res.add(curr);
        }

        if(open<n)
        {
            func(n,open+1,close,curr+"(",res);
        }

        if(close<open)
        {
            func(n, open,close+1,curr+")",res);
        }
    }
}