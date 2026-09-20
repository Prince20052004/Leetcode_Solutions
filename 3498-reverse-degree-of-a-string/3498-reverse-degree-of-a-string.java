class Solution {
    public int reverseDegree(String s) {
        int n=s.length();
        long result=0;
        for(int i=0; i<n; i++){
            int temp=(i+1)*(26-(s.charAt(i)-'a'));
            result+=temp;
        }
        return (int)result;
    }
}