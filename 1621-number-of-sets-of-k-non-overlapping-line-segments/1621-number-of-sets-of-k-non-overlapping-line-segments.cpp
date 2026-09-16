class Solution {
public:
    int numberOfSets(int n, int k) {
        int M=1e9+7;
        vector<vector<int>> dp(k+1, vector<int>(n, 0));
        for(int i=0; i<n; i++){
            dp[0][i]=1;
        }
        for(int i=1; i<=k; i++){
            long long prefixsum=0;
            for(int j=1; j<n; j++){
                prefixsum=(prefixsum+dp[i-1][j-1])%M;
                dp[i][j]=(dp[i][j-1]+prefixsum)%M;
            }
        }
        return dp[k][n-1];
    }
};