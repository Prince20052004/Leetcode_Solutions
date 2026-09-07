class Solution {
public:
    int distinctSubseqII(string s) {
        int mod=1000000007;
        int total=0;
        vector<int> end(26);
        for(char c: s){
            int index=c-'a';
            int oldtotal=total;
            int subseq=(oldtotal+1-end[index]+mod)%mod;
            total=(total+subseq)%mod;
            end[index]=(end[index]+subseq)%mod;
        }
        return total;
    }
};