class Solution {
public:
    string smallestSubsequence(string s) {
        int n=s.length();
        string result;
        vector<bool> token(26, false);
        vector<int> lastindex(26);
        for(int i=0; i<n; i++){
            lastindex[s[i] - 'a'] = i;
        }
        for(int i=0; i<n; i++){
            char ch=s[i];
            int idx=ch-'a';
            if(token[idx])
                continue;
             while (!result.empty() && result.back() > ch && lastindex[result.back() - 'a'] > i) {
                token[result.back() - 'a'] = false;
                result.pop_back();
            }
            result.push_back(ch);
            token[idx]=true;
        }
        return result;
    }
};