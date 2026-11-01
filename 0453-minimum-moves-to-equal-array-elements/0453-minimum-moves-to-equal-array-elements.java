class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int sum=0;
        int minele=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            sum+=nums[i];
            minele=Math.min(minele, nums[i]);
        }
        return sum-n*minele;
    }
}