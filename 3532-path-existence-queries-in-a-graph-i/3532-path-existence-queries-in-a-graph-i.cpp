class Solution {
public:
    vector<bool> pathExistenceQueries(int n, vector<int>& nums, int maxDiff, vector<vector<int>>& queries) {
        vector<int> comp(n);
        for(int i=1; i<n; i++){
            int diff=abs(nums[i]-nums[i-1]);
            if(diff<=maxDiff)
                comp[i]=comp[i-1];
            else
                comp[i]=i;
        }
        int l=queries.size();
        vector<bool> ans(l);
        for(int i=0; i<l; i++){
            int node1=queries[i][0], node2=queries[i][1];
            if(comp[node1]==comp[node2])
                ans[i]=true;
        }
        return ans;
    }
};