class Solution {
public:
    vector<int> sequentialDigits(int low, int high) {
        string s="123456789";
        int minlen=to_string(low).length();
        int maxlen=to_string(high).length();
        vector<int> ans;
        for(int i=minlen; i<=maxlen; i++){
            for(int start=0; start+i<=9; start++){
                string substr=s.substr(start,i);
                int num=stoi(substr);
                if(num>=low && num<=high)
                    ans.push_back(num);
            }
        }
        return ans;
    }
};