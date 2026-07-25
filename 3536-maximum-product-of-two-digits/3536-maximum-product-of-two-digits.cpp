class Solution {
public:
    int maxProduct(int n) {
        vector<int> res;
        while(n>0){
            int digit=n%10;
            res.push_back(digit);
            n/=10;
        }
        sort(res.begin(), res.end());
        int ans=res[res.size()-1]*res[res.size()-2];
        return ans;
    }
};