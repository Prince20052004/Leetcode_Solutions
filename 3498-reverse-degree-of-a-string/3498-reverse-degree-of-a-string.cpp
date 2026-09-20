class Solution {
public:
    int reverseDegree(string s) {
        int n=s.size();
        long long result=0;
        for(int i=0; i<n; i++){
            int temp=(i+1)*(26-(s[i]-'a'));
            result+=temp;
        }
        return result;
    }
};