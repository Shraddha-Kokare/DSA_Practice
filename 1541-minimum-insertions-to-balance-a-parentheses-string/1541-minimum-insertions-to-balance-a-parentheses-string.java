class Solution {
    public int minInsertions(String s) {
        int n=s.length();
        int open=0,ins=0,i=0;
        while(i<n)
        {
            if(s.charAt(i)=='(')
            {
                open++;
            }
            else{
                // check for two ))
                if((i+1)<n && s.charAt(i+1)==')')
                {
                    if(open==0)
                    {
                        ins++;
                    }
                    else{
                        open--;
                    }
                    i++;
                }
                else{
                    if(open==0)
                    {
                        ins+=2;
                    }
                    else{
                        ins++;
                        open--;
                    }
                }
            }


            i++;
        }

        ins+=open*2;

        return ins;
    }
}