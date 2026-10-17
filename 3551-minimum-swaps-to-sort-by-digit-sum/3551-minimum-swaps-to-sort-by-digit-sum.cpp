class Solution {
public:
    int getdigitsum(int num){
        int sum=0; 
        while(num>0){
            sum+=(num%10);
            num/=10;
        }
        return sum;
    }
    int minSwaps(vector<int>& nums) {
        int n=nums.size();
        vector<int> aftersorted(nums);
        auto lambda=[&](int num1, int num2){
            int num1sum=getdigitsum(num1);
            int num2sum=getdigitsum(num2);
            if(num1sum!=num2sum){
                return num1sum<num2sum;
            }
            return num1<num2;
        };
        sort(begin(aftersorted), end(aftersorted), lambda);
        unordered_map<int, int> valtoidx;
        for(int i=0; i<n; i++){
            valtoidx[nums[i]]=i;
        }
        int swapcount=0;
        for(int i=0; i<n; i++){
            int val=aftersorted[i];
            int currval=nums[i];
            if(val==currval)
                continue;
            int idx=valtoidx[val];
            nums[i]=val;
            nums[idx]=currval;
            valtoidx[val]=i;
            valtoidx[currval]=idx;
            swapcount++;
        }
        return swapcount;
    }
};