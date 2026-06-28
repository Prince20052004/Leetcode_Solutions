class Solution {
public:
    int maximumElementAfterDecrementingAndRearranging(vector<int>& arr) {
        int n=arr.size();
        vector<int> count(n+1,0);
        for(int a:arr){
            count[min(a, n)]++;
        }
        int ans=1;
        for(int i=2; i<=n; i++){
            ans=min(i, ans+count[i]);
        }
        return ans;
    }
};