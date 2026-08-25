class Solution {
public:
    int missingMultiple(vector<int>& nums, int k) {
        unordered_set<int> hash(nums.begin(), nums.end());
        int target=k;
        while(true){
            if(hash.count(target)==0){
                return target;
            }
            target+=k;
        }
        return -1;
    }
};