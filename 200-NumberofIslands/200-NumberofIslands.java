// Last updated: 8/17/2025, 8:37:26 AM
class Solution {

    int[] deltaRow = {-1,0,1,0};
    int[] deltaCol = {0,1,0,-1};

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        boolean[][] visited = new boolean[n][m];
        int result = 0;
        for(int i = 0 ;i<n; i++) {
            for(int j = 0 ; j<m;j++) {
                if(!visited[i][j] && grid[i][j]=='1' ) {
                    result++;
                    dfs(i,j,grid,visited,n,m);
                }
            }
        }
        return result;
    }

    void dfs(int r, int c, char[][] grid, boolean[][] vis, int n, int m) {
        vis[r][c] = true;
        for(int i = 0;i<4;i++) {
            int nr = r + deltaRow[i];
            int nc = c + deltaCol[i];
            if(nr>=0 && nr<n && nc >=0 && nc <m && grid[nr][nc]=='1' && !vis[nr][nc] ){
                dfs(nr,nc,grid,vis,n,m);
            }
        }
    }
}