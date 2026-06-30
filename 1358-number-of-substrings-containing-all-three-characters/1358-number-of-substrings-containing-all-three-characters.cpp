class Solution {
public:
    int numberOfSubstrings(string s) {
        vector<int> last(3, -1);
        int ans=0, n=s.length();
        for(int i=0; i<n; i++){
            last[s[i]-'a']=i;
            int minimum=min(last[0], min(last[1], last[2]));
            int leftarrays=1+minimum;
            ans+=leftarrays;
        }
        return ans;
    }
};