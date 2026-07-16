class Solution {
    public int gcd(int a, int b){
        if(b==0)
            return a;
        else
            return gcd(b, a%b);
    }
    public long gcdSum(int[] nums) {
        int max=-1, n=nums.length;
        int prefixgcd[]=new int[n];
        for(int i=0; i<n; i++){
            max=Math.max(nums[i], max);
            prefixgcd[i]=gcd(nums[i], max);
        }
        long ans=0;
        Arrays.sort(prefixgcd);
        for(int i=0,j=n-1; i<j; i++,j--){
            ans+=gcd(prefixgcd[i], prefixgcd[j]);
        }
        return ans;
    }
}