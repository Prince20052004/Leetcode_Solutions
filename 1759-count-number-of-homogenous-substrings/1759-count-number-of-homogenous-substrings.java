class Solution {
    double mod=1e9+7;
    public int countHomogenous(String s) {
        int n=s.length();
        int result=0;
        int length=0;
        for(int i=0; i<n; i++){
            if(i>0 && s.charAt(i)==s.charAt(i-1))
                length+=1;
            else
                length=1;
            result=(result+length)%(int)mod;
        }
        return result;
    }
}