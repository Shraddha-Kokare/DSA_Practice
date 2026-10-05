class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        // HashSet<List<Integer>> ans = new HashSet<>();
        List<Integer> curr=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        func(0,candidates.length,candidates,target,curr,ans);

        return ans;
    }

    public void func(int ind, int n, int[] candi, int target, List<Integer> curr, List<List<Integer>> res)
    {
        if(target == 0) {
    res.add(new ArrayList<>(curr));
    return;
}

        for(int i=ind;i<n;i++)
        {
            if(i>ind && candi[i]==candi[i-1])
                continue;

            if(candi[i]>target)
                break;

            curr.add(candi[i]);

            func(i + 1,n, candi, target - candi[i], curr, res);

            curr.remove(curr.size() - 1);
        }
    }
}