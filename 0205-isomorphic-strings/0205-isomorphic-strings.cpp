class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if(s.length()!=t.length()){
            return false;
        }
        unordered_map<char,char> mapss;
        unordered_map<char,char> maptt;
        for(int i=0; i<s.size(); i++){
            char ss=s[i];
            char tt=t[i];
            if((mapss.count(ss) && mapss[ss]!=tt)){
                return false;
            }
            if((maptt.count(tt) && maptt[tt]!=ss)){
                return false;
            }
            mapss[ss]=tt;
            maptt[tt]=ss;
        }
        return true;
    }
};