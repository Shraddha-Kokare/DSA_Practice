class Solution {
    public List<String> letterCombinations(String digits) {
        String[] tele={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> res=new ArrayList<>();
        collect(digits,"",0,tele,res);
        return res;
    }

    public void collect(String digits, String curr, int ind, String[] tele, List<String> res)
    {
        if(curr.length()==digits.length())
        {
            res.add(new String(curr));
            return;
        }

        int consider=digits.charAt(ind)-'0';
        int cur_ind=consider-2;
        for(char ch:tele[cur_ind].toCharArray())
        {
            collect(digits,curr+ch,ind+1,tele,res);
        }

    }
}