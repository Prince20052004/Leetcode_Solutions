class Solution {
        public int countoverlap(int[][] img1, int[][] img2, int row, int col){
        int n=img1.length;
        int count=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int imgrow=i+row;
                int imgcol=j+col;
                if(imgrow<0 || imgrow>=n || imgcol<0 || imgcol>=n){
                    continue;
                }
                if(img1[i][j]==1 && img2[imgrow][imgcol]==1){
                    count++;
                }
            }
        }
        return count;
    }
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n=img1.length;
        int maxoverlap=0;
        for(int row=-n+1; row<n; row++){
            for(int col=-n+1; col<n; col++){
                int count=countoverlap(img1, img2, row, col);
                maxoverlap=Math.max(maxoverlap, count);
            }
        }
        return maxoverlap;
    }
}