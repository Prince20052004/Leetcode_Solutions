class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n=arr.length;
        int i=0;
        int j=0;
        int currsum=0;
        int minbestlen[]=new int[n];
        int bestminlen=Integer.MAX_VALUE;
        int result=Integer.MAX_VALUE;
        while(j<n){
            currsum +=arr[j];
            while(i<j && currsum>target){
                currsum-=arr[i++];
            }
            if(currsum==target){
                int len=j-i+1;
                if(i>0 && minbestlen[i-1]!=Integer.MAX_VALUE){
                    result=Math.min(result, len+minbestlen[i-1]);
                }
                bestminlen=Math.min(bestminlen, len);
            }
            minbestlen[j]=bestminlen;
            j++;
        }
        return result==Integer.MAX_VALUE? -1:result;
    }
}