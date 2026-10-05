class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        func(0,k,n,curr,res);

        return res;
    }

    public void func(int ind, int k, int n, List<Integer> curr, List<List<Integer>> res)
    {
        if(curr.size()==k){
            if(n==0)
            {
                res.add(new ArrayList<>(curr)); 
            }
            return;
        }
        
        for(int i=ind+1;i<=9;i++)
        {
            if(i>n)
            {
                break;
            }

            curr.add(i);
            func(i,k,n-i,curr,res);
            curr.remove(curr.size()-1);
        }
    }
}