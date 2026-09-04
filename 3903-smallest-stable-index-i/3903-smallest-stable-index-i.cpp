class Solution {
public:
    int firstStableIndex(vector<int>& nums, int k) {
        int n=nums.size();
        vector<int> minimum(n);
        int minelement=INT_MAX;
        for(int i=n-1; i>=0; i--){
            minelement=min(minelement, nums[i]);
            minimum[i]=minelement;
        }
        int maxelement=INT_MIN;
        for(int j=0; j<n; j++){
            maxelement=max(maxelement, nums[j]);
            if(maxelement-minimum[j]<=k){
                return j;
            }
        }
        return -1;
    }
};