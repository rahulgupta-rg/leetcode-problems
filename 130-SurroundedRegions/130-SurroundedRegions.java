// Last updated: 8/17/2025, 9:31:30 AM
class Solution {

    int[] dr = {-1,0,1,0};
    int[] dc = {0,1,0,-1};

    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;

        boolean[][] vis = new boolean[n][m];

        for(int i = 0 ; i<n;i++) {
            for(int j = 0 ; j < m ; j++) {
                if(i==0 || i == n-1 || j==0 || j==m-1) {
                    if(board[i][j]=='O' && !vis[i][j]) {
                        dfs(i,j,board,vis,n,m);
                    }
                }
            }
        } 

        for(int i = 0 ; i<n;i++) {
            for(int j = 0 ; j < m ; j++) {
                //System.out.print(board[i][j]+" ");
                if(board[i][j]=='#') 
                    board[i][j]='O';
                else if(board[i][j]=='O') 
                    board[i][j]='X';
            }
            //System.out.println();
        }


    }

    void dfs(int r, int c, char[][] board, boolean[][] vis, int n, int m) {
        vis[r][c]=true;
        board[r][c]='#';
        for(int i = 0;i < 4 ; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];
            if(nr>=0 && nr<n && nc>=0 && nc<m && !vis[nr][nc] && board[nr][nc]=='O') {
                dfs(nr,nc,board,vis,n,m);
            }
        }
    }
}