class Solution {
public:
    int maximumLength(vector<int>& nums) {
        unordered_map<long long, int> hmap;
        for(int num: nums){
            hmap[num]++;
        }
        int ans=0;
        if(hmap.count(1)){
            int ones=hmap[1];
            ans=(ones%2==0)? ones-1:ones;
            hmap.erase(1);
        }
        for(auto &[num, freq]:hmap){
            int count=0;
            long long curr=num;
            while(hmap.count(curr)){
                if(hmap[curr]>=2)
                    count+=2;
                else{
                    count++;
                    break;
                }
                if(curr>LLONG_MAX/curr)
                    break;
                curr=curr*curr;
            }
            if(count%2==0)
                count--;
            ans=max(ans, count);
        }
        return ans;
    }
};