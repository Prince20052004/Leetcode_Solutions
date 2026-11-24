class Solution {
public:
    int maxLength(vector<int>& nums) {
        int test=2, left=0, product=1;
        for(int right=0; right<size(nums); ++right){
            int x=nums[right];
            while(gcd(product, x)>1){
                product/=nums[left++];
            }
            product*=x;
            test=max(test, right-left+1);
        }
        return test;
    }
};