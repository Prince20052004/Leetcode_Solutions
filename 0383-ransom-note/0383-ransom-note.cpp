class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        vector<int> count(26);
        for(char c: magazine){
            count[c-'a']++;
        }
        for(char c: ransomNote){
            if(count[c-'a']==0){
                return false;
            }
            else
                count[c-'a']--;
        }
        return true;
    }
};