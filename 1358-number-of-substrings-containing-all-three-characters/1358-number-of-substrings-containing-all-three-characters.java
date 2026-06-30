class Solution {
    public int numberOfSubstrings(String s) {
        int last[]=new int[3];
        Arrays.fill(last, -1);
        int ans=0, n=s.length();
        for(int i=0; i<n; i++){
            last[s.charAt(i)-'a']=i;
            int min=Math.min(last[0], Math.min(last[1], last[2]));
            int leftarrays=1+min;
            ans+=leftarrays;
        }
        return ans;
    }
}