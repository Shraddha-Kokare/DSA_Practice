class Solution {
    public boolean exist(char[][] board, String word) {
        char first=word.charAt(0);
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(board[i][j]==first)
                {
                    if(search(0,n,i,j,board,word))
                    {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public boolean search(int ind, int n, int r, int c,char[][] board,String word)
    {
        if(ind==(word.length()-1))
        {
            if(word.charAt(ind)==board[r][c])
            {
                return true;
            }
            return false;
        }

        if(word.charAt(ind)!=board[r][c])
        {
            return false;
        }

        char ch=board[r][c];
        board[r][c]=' ';

        int[] dira={-1,0,1,0};
        int[] dirb={0,1,0,-1};

        int mx=board.length;
        int nx=board[0].length;

        for(int i=0;i<4;i++)
        {
            int nrow=r+dira[i];
            int ncol=c+dirb[i];

            if(nrow>=0 && nrow<mx && ncol>=0 && ncol<nx && board[nrow][ncol] != ' ')
            {
                if(search(ind+1,n,nrow,ncol,board,word))
                    return true;
            }
        }

        board[r][c]=ch;

        return false;
    }
}