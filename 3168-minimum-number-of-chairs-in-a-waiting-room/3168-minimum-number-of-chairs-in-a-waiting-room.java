class Solution {
    public int minimumChairs(String s) {
        int count=0;
        int maximum=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='E'){
                count++;
                maximum=Math.max(maximum, count);
            }
            else{
                count--;
            }
        }
        return maximum;
    }
}