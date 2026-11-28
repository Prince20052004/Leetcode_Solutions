class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        for(int c=0; c<n; c++){
            for(int r=0; r<m-1; r++){
                if(grid[r][c]!=grid[r+1][c])
                    return false;
            }
        }
        for(int c=0; c<n-1; c++){
            if(grid[0][c]==grid[0][c+1])
                return false;
        }
        return true;
    }
}