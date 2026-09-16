class Solution {
    public int numberOfSets(int n, int k) {
        int M=1000000007;
        int[][] dp=new int[k+1][n];
        for(int i=0; i<n; i++){
            dp[0][i]=1;
        }
        for(int i=1; i<=k; i++){
            long prefixsum=0;
            for(int j=1; j<n; j++){
                prefixsum=(prefixsum+dp[i-1][j-1])%M;
                dp[i][j]=(int)((dp[i][j-1]+prefixsum)%M);
            }
        }
        return dp[k][n-1];
    }
}