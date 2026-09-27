class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer> lastlength=new Stack<>();
        StringBuilder result=new StringBuilder();
        for(char ch: s.toCharArray()){
            if(ch=='('){
                lastlength.push(result.length());
            }
            else if(ch==')'){
                int l=lastlength.pop();
                reverseSegment(result, l, result.length()-1);
            }
            else{
                result.append(ch);
            }
        }
        return result.toString();
    }
    private void reverseSegment(StringBuilder sb, int left, int right){
        while(left<right){
            char temp=sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }
    }
}