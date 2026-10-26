class Solution {
    int m, n;
    int[][] dir={{0,1},{0,-1},{1,0},{-1,0}};
    long dfs(int i, int j, int[][] grid){
        long sum=grid[i][j];
        grid[i][j]=0;
        for(int[] d: dir){
            int ii=i+d[0];
            int jj=j+d[1];
            if(ii>=0 && ii<m && jj>=0 && jj<n && grid[ii][jj]>0){
                sum+=dfs(ii, jj, grid);
            }
        }
        return sum;
    }
    public int countIslands(int[][] grid, int k) {
        m=grid.length;
        n=grid[0].length;
        int count=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]>0){
                    long sum=dfs(i, j, grid);
                    if(sum%k==0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}