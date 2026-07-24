class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;
        int maxel = 0;
        for (int num : nums) {
            maxel = Math.max(maxel, num);
        }
        int t=1;
        while(t<=maxel){
            t<<=1;
        }
        boolean[] s1=new boolean[t];
        boolean[] s2=new boolean[t];
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                s1[nums[i]^nums[j]]=true;
            }
        }
        for(int i=0; i<t; i++){
            if(s1[i]==true){
                for(int num: nums){
                    s2[i^num]=true;
                }
            }
        }
        int count=0;
        for(int i=0; i<t; i++){
            if(s2[i]==true)
                count++;
        }
        return count;
    }
}