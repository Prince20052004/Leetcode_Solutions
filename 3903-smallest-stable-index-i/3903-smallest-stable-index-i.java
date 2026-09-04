class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] minimum=new int[n];
        int minelement=Integer.MAX_VALUE;
        for(int i=n-1; i>=0; i--){
            minelement=Math.min(minelement, nums[i]);
            minimum[i]=minelement;
        }
        int maxelement=Integer.MIN_VALUE;
        for(int j=0; j<n; j++){
            maxelement=Math.max(maxelement, nums[j]);
            if(maxelement-minimum[j]<=k){
                return j;
            }
        }
        return -1;
    }
}