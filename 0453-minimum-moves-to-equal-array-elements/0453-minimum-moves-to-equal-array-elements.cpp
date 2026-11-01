class Solution {
public:
    int minMoves(vector<int>& nums) {
        int n=nums.size();
        int sum=0;
        int minele=INT_MAX;
        for(int i=0; i<n; i++){
            sum+=nums[i];
            minele=min(minele, nums[i]);
        }
        return sum-n*minele;
    }
};