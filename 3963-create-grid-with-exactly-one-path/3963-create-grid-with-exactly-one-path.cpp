class Solution {
public:
    vector<string> createGrid(int m, int n) {
        vector<string> grid(m);
        grid[0]=string(n, '.');
        for(int i=1; i<m; i++){
            grid[i]=string(n, '#');
        }
        for(int i=1; i<n; i++){
            grid[0][i]='.';
        }
        for(int i=1; i<m; i++){
            grid[i][n-1]='.';
        }
        return grid;
    }
};