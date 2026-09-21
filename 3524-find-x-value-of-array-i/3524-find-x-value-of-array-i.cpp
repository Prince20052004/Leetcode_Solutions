class Solution {
public:
    vector<long long> resultArray(vector<int>& nums, int k) {
        vector<long long> dp(k);
        vector<long long> ans(k);
        for(int num: nums){
            vector<long long> newdp(k);
            int numMod=num%k;
            newdp[numMod]++;
            for(int i=0; i<k; i++){
                int newrem=(int)((long long)i*numMod%k);
                newdp[newrem]+=dp[i];
            }
            for(int i=0; i<k; i++){
                ans[i]+=newdp[i];
            }
            dp=newdp;
        }
        return ans;
    }
};