class Solution {
    public long countGood(int[] nums, int k) {
        int n=nums.length;
        int i=0;
        long result=0;
        HashMap<Integer, Integer> mp=new HashMap<>();
        long pairs=0;
        for (int j = 0; j < n; j++) {
            pairs += mp.getOrDefault(nums[j], 0);
            mp.put(nums[j], mp.getOrDefault(nums[j], 0) + 1);
            while (pairs >= k) {
                result += (n - j);
                mp.put(nums[i], mp.get(nums[i]) - 1);
                pairs -= mp.get(nums[i]);
                i++;
            }
        }
        return result;
    }
}