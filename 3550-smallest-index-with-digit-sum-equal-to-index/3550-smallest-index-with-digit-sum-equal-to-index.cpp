class Solution {
public:
    int smallestIndex(vector<int>& nums) {
        int n=nums.size();
        for(int i=0; i<n; i++){
            int num=nums[i];
            string t=to_string(num);
            int sum=0;
            for(int j=0; j<t.size(); j++){
                sum+=t[j]-'0';
            }
            if(sum==i){
                return i;
            }
        }
        return -1;
    }
};