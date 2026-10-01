class Solution {
public:
    bool isValid(string s) {
        stack<char> stack;
        for(char ch : s){
            if(ch=='(')
                stack.push(')');
            else if(ch=='{')
                stack.push('}');
            else if(ch=='[')
                stack.push(']');
            else{
                if(stack.empty() || stack.top()!=ch)
                    return false;
                stack.pop();
            }
        }
        return stack.empty(); 
    }
};