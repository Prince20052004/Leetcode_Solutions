class Solution {
public:
    vector<int> distinctDifferenceArray(vector<int>& nums) {
        int n=nums.size();
        vector<int> diff(n);
        for(int i=0; i<n; i++){
            unordered_set<int> prefix;
            for(int j=0; j<=i; j++){
                prefix.insert(nums[j]);
            }
            unordered_set<int> suffix;
            for(int j=i+1; j<n; j++){
                suffix.insert(nums[j]);
            }
            diff[i]=prefix.size()-suffix.size();
        }
        return diff;
    }
};