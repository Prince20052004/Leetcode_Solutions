class Solution {
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
        int result=0;
        boolean allzero=true;
        for(int x :nums){
            result=(result^x);
            if(x!=0){
                allzero=false;
            }
        }
        if(allzero){
            return 0;
        }
        return (result==0)? n-1: n;
    }
}