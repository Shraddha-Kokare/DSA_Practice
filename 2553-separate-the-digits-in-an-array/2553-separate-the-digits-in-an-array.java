class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> res=new ArrayList<>();
        for(int num:nums)
        {
            List<Integer> temp = new ArrayList<>();

            while (num > 0) {
                temp.add(num % 10);
                num = num / 10;
            }

            for (int i = temp.size() - 1; i >= 0; i--) {
                res.add(temp.get(i));
            }
        }

        int n=res.size();
        int[] ans=new int[n];
        for(int i=0;i<n;i++)
        {
            ans[i]=res.get(i);
        }

        return ans;
    }
}