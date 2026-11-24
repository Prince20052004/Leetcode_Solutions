class Solution {
    public int maxLength(int[] nums) {
        int test=2, left=0, product=1;
        for(int right=0; right<nums.length; ++right){
            int x=nums[right];
            while(gcd(product, x)>1){
                product/=nums[left++];
            }
            product*=x;
            test=Math.max(test, right-left+1);
        }
        return test;
    }
    private int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}