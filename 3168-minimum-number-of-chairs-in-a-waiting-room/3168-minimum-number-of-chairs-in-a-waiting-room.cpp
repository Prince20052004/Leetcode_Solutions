class Solution {
public:
    int minimumChairs(string s) {
        int count=0;
        int maximum=0;
        for(int i=0; i<s.length(); i++){
            if(s[i]=='E'){
                count++;
                maximum=max(maximum, count);
            }
            else{
                count--;
            }
        }
        return maximum;
    }
};