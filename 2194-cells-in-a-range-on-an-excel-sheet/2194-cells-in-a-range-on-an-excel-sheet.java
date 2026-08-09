class Solution {
    public List<String> cellsInRange(String s) {
        List<String> ans=new ArrayList<>();
        char c1=s.charAt(0), r1=s.charAt(1), c2=s.charAt(3), r2=s.charAt(4);
        for(char i=c1; i<=c2; i++){
            for(char j=r1; j<=r2; j++){
                String res=""+i+j;
                ans.add(res);
            }
        }
        return ans;
    }
}