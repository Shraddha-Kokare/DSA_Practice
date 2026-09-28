class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder res=new StringBuilder();
        Map<String,String> mpp=new HashMap<>();
        for(List<String> ls:knowledge)
        {
            mpp.put(ls.get(0),ls.get(1));
        }
        int n=s.length();
        int i=0;
        while(i<n)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                i++;
                StringBuilder curr=new StringBuilder();
                while(i<n && s.charAt(i)!=')')
                {
                    curr.append(s.charAt(i));
                    i++;
                }

                // String val=getVal(knowledge, curr.toString());
                res.append(mpp.getOrDefault(curr.toString(),"?"));
            }
            else{
                res.append(ch);
            }
            i++;
        }

        return res.toString();
    }

    // public static String getVal(List<List<String>> knowledge, String key)
    // {
    //     for(List<String> ls:knowledge)
    //     {
    //         if(ls.get(0).equals(key))
    //         {
    //             return ls.get(1);
    //         }
    //     }

    //     return "?";
    // }
}