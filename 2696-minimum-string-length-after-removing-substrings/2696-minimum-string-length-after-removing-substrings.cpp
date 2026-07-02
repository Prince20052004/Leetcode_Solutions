class Solution {
public:
    int minLength(string s) {
        int n=s.size();
        vector<char> str(n); 
        int w=0;
        for(int r=0; r<n; r++){
            if(w==0){
                str[w++]=s[r];
                continue;
            }
            if(s[r]=='B'&&str[w-1]=='A'){
                w--;
            }
            else if(s[r]=='D'&&str[w-1]=='C'){
                w--;
            }
            else{
                str[w++]=s[r];
            }
        }
        return w;
    }
};