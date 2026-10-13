class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        for(int i=0; i<n; i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        long largehalf=0;
        long smallhalf=0;
        int mid=n/2;
        for(int i=0; i<mid; i++){
            smallhalf+=nums[i];
        }
        for(int i=mid; i<n; i++){
            largehalf+=nums[i];
        }
        return largehalf-smallhalf;
    }
}