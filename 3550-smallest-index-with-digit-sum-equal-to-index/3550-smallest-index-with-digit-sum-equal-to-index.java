class Solution {
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        for(int i=0; i<n; i++){
            int num=nums[i];
            String t=Integer.toString(num);
            int sum=0;
            for(int j=0; j<t.length(); j++){
                sum+=t.charAt(j)-'0';
            }
            if(sum==i){
                return i;
            }
        }
        return -1;
    }
}