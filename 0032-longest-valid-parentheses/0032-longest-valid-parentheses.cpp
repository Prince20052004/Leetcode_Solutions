class Solution {
public:
    int longestValidParentheses(string s) {
        int maxlength=0;
        stack<int> stack;
        stack.push(-1);
        for(int i=0; i<s.size(); i++){
            if(s[i]=='('){
                stack.push(i);
            }
            else{
                stack.pop();
                if(stack.empty()){
                    stack.push(i);
                }
                else{
                    maxlength=max(maxlength, i-stack.top());
                }
            }
        }
        return maxlength;
    }
};