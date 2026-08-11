class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;
        int seq=nums[0];
        for(int j=1; j<n; j++){
            if(nums[j]==nums[j-1]+1){
                seq+=nums[j];
            }
            else{
                break;
            }
        }
        HashSet<Integer> st=new HashSet<>();
        for(int num: nums){
            st.add(num);
        }
        while(st.contains(seq)){
            seq++;
        }
        return seq; 
    }
}