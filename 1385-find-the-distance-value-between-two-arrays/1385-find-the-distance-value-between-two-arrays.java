class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count=0;
        int n=arr2.length;
        for(int i=0; i<arr1.length; i++){
            int j=Arrays.binarySearch(arr2, arr1[i]);
            if(j<0){
                j=-j-1;
            }
            if(j==0){
                if(Math.abs(arr2[0]-arr1[i])>d){
                    count++;
                }
            }
            else if(j>=n){
                if(Math.abs(arr1[i]-arr2[n-1])>d){
                    count++;
                }
            }
            else{
                if(Math.abs(arr2[j]-arr1[i])>d&&Math.abs(arr1[i]-arr2[j-1])>d){
                    count++;
                }
            }
        }
        return count;
    }
}