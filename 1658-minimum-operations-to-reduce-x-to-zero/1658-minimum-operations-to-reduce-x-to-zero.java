class Solution {
    public int minOperations(int[] nums, int x) {
        int n=nums.length;
        HashMap<Integer, Integer> mp=new HashMap<>();
        int sum=0;
        mp.put(0, -1);
        for(int i=0; i<n; i++){
            sum+=nums[i];
            mp.put(sum, i);
        } 
        if(sum<x){
            return -1;
        }
        int remain=sum-x;
        int longest=Integer.MIN_VALUE;
        sum=0;
        for(int i=0; i<n; i++){
            sum+=nums[i];
            int findsum=sum-remain;
            if(mp.containsKey(findsum)){
                int idx=mp.get(findsum);
                longest=Math.max(longest, i-idx);
            }
        }
        return longest==Integer.MIN_VALUE? -1: (n-longest);
    }
}