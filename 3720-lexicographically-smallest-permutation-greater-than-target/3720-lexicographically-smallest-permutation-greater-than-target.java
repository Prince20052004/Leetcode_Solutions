class Solution {
    String result="";
    boolean solve(StringBuilder curr, int[] count, String target, int i, boolean greater){
        if(i==target.length()){
            if(greater){
                result=curr.toString();
                return true;
            }
            return false;
        }
        for(char ch='a'; ch<='z'; ch++){
            if(count[ch-'a']==0){
                continue;
            }
            if(greater==false && ch<target.charAt(i)){
                continue;
            }
            curr.append(ch);
            count[ch-'a']--;
            boolean isgreater=greater||ch>target.charAt(i);
            if(solve(curr, count, target, i+1, isgreater)){
                return true;
            }
            count[ch-'a']++;
            curr.deleteCharAt(curr.length()-1);
        }
        return false;
    }
    public String lexGreaterPermutation(String s, String target) {
        int[] count=new int[26];
        for(char ch: s.toCharArray() ){
            count[ch-'a']++;
        }
        StringBuilder curr=new StringBuilder();
        solve(curr, count, target, 0, false);
        return result;
    }
}