class Solution {
    public int titleToNumber(String columnTitle) {
        int count=1, res=0;
        for(int i=columnTitle.length()-1; i>=0; i--){
            res=res+(columnTitle.charAt(i)-'A'+1)*count;
            count*=26;
        }
        return res;
    }
}