class Solution {
    public int maxDepth(String s) {
        int stack=0;
        int result=0;
        for(char ch: s.toCharArray()){
            if(ch=='('){
                stack++;
            }
            else if(ch==')'){
                stack--;
            }
            result=Math.max(result, stack);
        }
        return result;
    }
}