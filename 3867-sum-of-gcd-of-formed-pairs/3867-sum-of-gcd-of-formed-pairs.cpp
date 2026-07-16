class Solution {
public:
    int gcd(int a, int b){
        if(b==0)
            return a;
        else
            return gcd(b, a%b);
    }
    long long gcdSum(vector<int>& nums) {
        int maximum=INT_MIN, n=nums.size();
        vector<int> prefixgcd(n);
        for(int i=0; i<n; i++){
            maximum=max(nums[i], maximum);
            prefixgcd[i]=gcd(nums[i], maximum);
        }
        long long ans=0;
        sort(prefixgcd.begin(), prefixgcd.end());
        for(int i=0,j=n-1; i<j; i++,j--){
            ans+=gcd(prefixgcd[i], prefixgcd[j]);
        }
        return ans;
    }
};