class Solution {
    public void removeFromMap(TreeMap<Integer, Integer> map, int key){
        int count=map.get(key);
        if(count==1){
            map.remove(key);
        }
        else{
            map.put(key, count-1);
        }
    }
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=nums.size();
        int[] presum=new int[n];
        presum[0]=nums.get(0);
        for(int i=1; i<n; i++){
            presum[i]=presum[i-1]+nums.get(i);
        }
        TreeMap<Integer, Integer> map=new TreeMap<>();
        int result=Integer.MAX_VALUE;
        for(int j=l-1; j<n; j++){
            if(j-l==-1){
                map.put(0, map.getOrDefault(0, 0)+1);
            }
            else if(j-l>=0){
                int val=presum[j-l];
                map.put(val, map.getOrDefault(val, 0)+1);
            }
            int outold=j-r-1;
            if(outold==-1){
                removeFromMap(map, 0);
            }
            else if(outold>=0){
                removeFromMap(map, presum[outold]);
            }
            Integer prevsum=map.lowerKey(presum[j]);
            if(prevsum!=null){
                result=Math.min(result, presum[j]-prevsum);
            }
        }
        return result==Integer.MAX_VALUE? -1: result;
    }
}