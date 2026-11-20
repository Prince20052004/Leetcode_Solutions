class Solution {
public:
    string convert(string s, int numRows) {
        if(numRows==1){
            return s;
        }
        vector<string> temp(numRows, "");
        int j=0;
        bool flag=false;
        string answer="";
        for(int i=0; i<s.length(); i++){
            if(j==numRows-1 || j==0){
                flag=!flag;
            }
            temp[j]+=s[i];
            if(flag){
                j++;
            }
            else{
                j--;
            }
        }
        for(int i=0; i<numRows; i++){
            answer+=temp[i];
        }
        return answer;
    }
};