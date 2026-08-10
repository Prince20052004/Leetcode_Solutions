class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        int[] ans=new int[k];
        int rem=nums.length-k;
        int top=-1;
        for(int a:nums){
            while(top>=0&& rem>0&& a<ans[top]){
                top--;
                rem--;
            }
            if(top<k-1){
                ans[++top]=a;
            }
            else{
                rem--;
            }
        }
        return ans;
    }
}