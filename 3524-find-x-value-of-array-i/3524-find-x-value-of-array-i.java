class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[] dp=new long[k];
        long[] ans=new long[k];
        for(int num: nums){
            long[] newdp=new long[k];
            int numMod=num%k;
            newdp[numMod]++;
            for(int i=0; i<k; i++){
                int newrem=(int)((long)i*numMod%k);
                newdp[newrem]+=dp[i];
            }
            for(int i=0; i<k; i++){
                ans[i]+=newdp[i];
            }
            dp=newdp;
        }
        return ans;
    }
}