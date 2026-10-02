class Solution {
    public boolean isPalindrome(String s) {
        // int n=s.length();
        StringBuilder ss=new StringBuilder();
        for(char ch:s.toCharArray())
        {
            char ch2=Character.toLowerCase(ch);
            if(Character.isLetterOrDigit(ch2))
            {
                ss.append(ch2);
            }
        }

        String now=ss.toString();
        int i=0,j=now.length()-1;

        while(i<j)
        {
            if(now.charAt(i)!=now.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}