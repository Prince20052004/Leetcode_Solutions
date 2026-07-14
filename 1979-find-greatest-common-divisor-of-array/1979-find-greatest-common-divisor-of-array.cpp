class Solution {
public:
    int gcd(int a, int b){
        if(a==0)
            return b;
        else
            return gcd(b%a, a);
    }
    int findGCD(vector<int>& nums) {
        int min=INT_MAX;
        int max=INT_MIN;
        for(int i=0; i<nums.size(); i++){
            if(nums[i]<min)
                min=nums[i];
            if(nums[i]>max)
                max=nums[i];
        }
        int result=gcd(min, max);
        return result;
    }
};