class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        if(n<=2){
            return n;
        }
        int minidx=0;
        int maxidx=0;
        for(int i=1; i<n; i++){
            if(nums[i]<nums[minidx]){
                minidx=i;
            }
            if(nums[i]>nums[maxidx]){
                maxidx=i;
            }
        }
        int left=Math.min(minidx, maxidx);
        int right=Math.max(minidx, maxidx);
        return Math.min(left+1+n-right, Math.min(right+1, n-left));
    }
}