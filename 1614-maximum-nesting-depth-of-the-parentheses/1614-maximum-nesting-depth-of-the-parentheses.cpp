class Solution {
public:
    int maxDepth(string s) {
        int stack=0;
        int result=0;
        for(char &ch: s){
            if(ch=='('){
                stack++;
            }
            else if(ch==')'){
                stack--;
            }
            result=max(result, stack);
        }
        return result;
    }
};