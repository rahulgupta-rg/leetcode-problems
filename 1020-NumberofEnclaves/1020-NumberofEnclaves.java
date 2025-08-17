// Last updated: 8/17/2025, 8:18:47 AM
class Solution {

    public int numEnclaves(int[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m];

        int[] deltaRow = {-1,0,1,0};
        int[] deltaCol = {0,1,0,-1};

        for(int i = 0; i < n;i++) {
            for(int j = 0; j < m ; j++) {
                if(i==0 || i ==n-1 || j==0 || j==m-1) {
                    if(grid[i][j]==1) {
                        q.offer(new Pair(i,j));
                        visited[i][j]=1;
                    }
                    
                }
            }
        }
        while(!q.isEmpty())  {
            Pair p = q.remove();
            int row = p.r;
            int col = p.c;

            for(int i = 0 ; i < 4 ; i++) {
                int nr = row+deltaRow[i];
                int nc = col+deltaCol[i];

                if(nr>= 0 && nr<n && nc >=0 && nc<m && grid[nr][nc]==1 && visited[nr][nc]!=1) {
                    q.offer(new Pair(nr,nc));
                    visited[nr][nc]=1;
                }
            }

        }

        int count = 0;
        for(int i = 0; i < n;i++) {
            for(int j = 0; j < m ; j++) {
                if(grid[i][j]==1 && visited[i][j]==0) {
                    count++;
                }
            }
        }
        return count;
     }
}

class Pair {
    int r;
    int c;
    public Pair(int r, int c) {
        this.r = r;
        this.c = c;
    }
}