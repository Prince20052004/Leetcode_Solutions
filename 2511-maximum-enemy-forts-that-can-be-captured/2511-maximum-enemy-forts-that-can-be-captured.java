class Solution {
    public int captureForts(int[] forts) {
        int sizee=forts.length;
        int res=0;
        for(int i=0,j=0; i<sizee; i++){
            if(forts[i]!=0){
                if(forts[j]==-forts[i]){
                    res=Math.max(res, i-j-1);
                }
                j=i;
            }
        }
        return res;
    }
}