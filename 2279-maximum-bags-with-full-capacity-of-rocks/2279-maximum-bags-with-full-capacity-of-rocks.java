class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n=capacity.length;
        int[] required=new int[n];
        for(int i=0; i<n; i++){
            int curr=rocks[i];
            int cap=capacity[i];
            int req=cap-curr;
            required[i]=req;
        }
        Arrays.sort(required);
        int count=0;
        for(int i=0; i<n; i++){
            if(additionalRocks>=required[i]){
                additionalRocks-=required[i];
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}