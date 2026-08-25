class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> hash=new HashSet<>();
        for(int num: nums){
            hash.add(num);
        }
        int target=k;
        while(true){
            if(!hash.contains(target)){
                return target;
            }
            target+=k;
        }
    }
}