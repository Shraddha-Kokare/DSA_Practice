class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        List<String> curr=new ArrayList<>();
        int n=s.length();
        func(0,n,s,curr,res);
        return res;
    }

    public void func(int ind, int n, String s, List<String> curr, List<List<String>> res)
    {
        if(ind==n)
        {
            res.add(new ArrayList<>(curr));
            return ;
        }

        for(int i=ind;i<n;i++)
        {
            if(isPalindrome(ind,i,s))
            {
                curr.add(s.substring(ind,i+1));
                func(i+1,n,s,curr,res);
                curr.remove(curr.size()-1);
            }
            
        }
    }

    public boolean isPalindrome(int ind, int end, String s)
    {
        int i=ind,j=end;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }

            i++;
            j--;
        }
        return true;
    }
}