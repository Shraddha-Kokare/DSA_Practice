class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        func(0,candidates,target,new ArrayList<Integer>(),res);
        return res;
    }

    public void func(int ind,int[] cand, int target,List<Integer> curr, List<List<Integer>> res)
    {
        if(ind==cand.length)
        {
        if(target==0)
        {
            res.add(new ArrayList<>(curr));
        }
        return;
        }

        if(cand[ind]<=target)
        {
            curr.add(cand[ind]);
            func(ind,cand,target-cand[ind],curr,res);
            curr.remove(curr.size()-1);
        }

        func(ind+1,cand,target,curr,res);
    }
}