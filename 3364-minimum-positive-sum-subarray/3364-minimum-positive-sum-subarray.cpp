class Solution {
public:
    int minimumSumSubarray(vector<int>& nums, int l, int r) {
        int n=nums.size();
        vector<int> presum(n, 0);
        presum[0]=nums[0];
        for(int i=1; i<n; i++){
            presum[i]=presum[i-1]+nums[i];
        }
        multiset<int> st;
        st.insert(0);
        int result=INT_MAX;
        for(int j=l-1; j<n; j++){
            if(j-l>=0){
                st.insert(presum[j-l]);
            }
            int outold=j-r-1;
            if(outold>=0){
                st.erase(st.find(presum[outold]));
            }
            else if(outold==-1){
                st.erase(st.find(0));
            }
            auto it=st.lower_bound(presum[j]);
            if(it!=begin(st)){
                it--;
                result=min(result, presum[j]-*it);
            }
        }
        return result==INT_MAX? -1: result;
    }
};