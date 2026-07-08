class Solution {
public:
    int mod=1000000007;
    vector<int> sumAndMultiply(string s, vector<vector<int>>& queries) {
        int n=s.length();
        vector<long> presum(n+1);
        vector<long> conval(n+1);
        vector<long> pow10(n+1);
        vector<int> count(n+1);
        for(int i=1; i<=n; i++){
            int num=s[i-1]-'0';
            presum[i]=(presum[i-1]+num)%mod;
            if(num==0){
                conval[i]=conval[i-1];
                count[i]=count[i-1];
            }
            else{
                conval[i]=(conval[i-1]*10+num)%mod;
                count[i]=count[i-1]+1;
            }
        }
        pow10[0]=1;
        for(int i=1; i<=n; i++){
            pow10[i]=(pow10[i-1]*10)%mod;
        }
        int q=queries.size();
        vector<int> ans(q);
        for(int i=0; i<q; i++){
            int left=queries[i][0], right=queries[i][1];
            long sum=(presum[right+1]-presum[left]+mod)%mod;
            long leftpart=conval[left];
            long rightpart=conval[right+1];
            int diff=count[right+1]-count[left];
            long power=pow10[diff];
            long range=(rightpart-(leftpart*power)%mod+mod)%mod;
            long x=(range*sum)%mod;
            ans[i]=(int)x;
        }
        return ans;
    }
};