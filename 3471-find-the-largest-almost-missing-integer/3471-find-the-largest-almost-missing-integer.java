class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        if(n==k){
            int maxval=nums[0];
            for(int num:nums){
                if(num>maxval){
                    maxval=num;
                }
            }
            return maxval;
        }
        int[] freq=new int[51];
        for(int i=0; i<n; i++){
            freq[nums[i]]++;
        }
        if(k==1){
            for(int i=50; i>0; i--){
                if(freq[i]==1){
                    return i;
                }
            }
            return -1;
        }
        int temp=-1;
        if(freq[nums[0]]==1){
            temp=Math.max(temp, nums[0]);
        }
        if(freq[nums[n-1]]==1){
            temp=Math.max(temp, nums[n-1]);
        }
        return temp;
    }
}