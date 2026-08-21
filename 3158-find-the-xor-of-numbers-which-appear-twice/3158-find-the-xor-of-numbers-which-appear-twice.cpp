class Solution {
public:
    int duplicateNumbersXOR(vector<int>& nums) {
        map<int, int> freq;
        for(int i: nums){
            freq[i]++;
        }
        int ans=0;
        for(auto j: freq){
            if(j.second==2){
                ans^=j.first;
            }
        }
        return ans;
    }
};