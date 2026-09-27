class Solution {
public:
    string reverseParentheses(string s) {
        stack<int> lastlength;
        string result;
        for(char &ch: s){
            if(ch=='('){
                lastlength.push(result.length());
            }
            else if(ch==')'){
                int l=lastlength.top();
                lastlength.pop();
                reverse(begin(result)+l, end(result));
            }
            else{
                result.push_back(ch);
            }
        }
        return result;
    }
};