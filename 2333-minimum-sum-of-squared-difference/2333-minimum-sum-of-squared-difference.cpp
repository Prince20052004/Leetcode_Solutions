class Solution {
public:
    long long minSumSquareDiff(vector<int>& nums1, vector<int>& nums2, int k1, int k2) {
        vector<int> freq(100001);
        int maxdiff=0;
        long long totaldiff=0;
        for(int i=0; i<nums1.size(); i++){
            int diff=abs(nums1[i]-nums2[i]);
            freq[diff]++;
            totaldiff+=diff;
            maxdiff=max(maxdiff, diff);
        }
        long k=(long)k1+k2;
        if(totaldiff<=k){
            return 0;
        }
        for(int d=maxdiff; d>0 && k>0; d--){
            int moves=min((int)k, freq[d]);
            freq[d]-=moves;
            freq[d-1]+=moves;
            k-=moves;
        }
        long long ans=0;
        for(int d=1; d<=maxdiff; d++){
            ans+=(long long)d*d*freq[d];
        }
        return ans;
    }
};