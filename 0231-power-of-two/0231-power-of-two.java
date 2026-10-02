class Solution {
    public boolean isPowerOfTwo(int n) {
        // if N & (N-1) == 0 
        if(n>0 && (n&(n-1))==0)
        {
            return true;
        }
        return false;
    }
}