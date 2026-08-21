class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer, Integer> freq=new HashMap<>();
        for(int i: nums){
            freq.put(i, freq.getOrDefault(i, 0)+1);
        }
        int ans=0;
        for(Map.Entry<Integer, Integer> entry: freq.entrySet()){
            if(entry.getValue()==2){
                ans^=entry.getKey();
            }
        }
        return ans;
    }
}