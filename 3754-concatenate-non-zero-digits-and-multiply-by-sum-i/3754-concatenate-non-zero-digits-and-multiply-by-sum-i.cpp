class Solution {
public:
    long long sumAndMultiply(int n) {
        string s=to_string(n);
        long long ans=0, sum=0;
        for(int i=0; i<s.length(); i++){
            int digit=s[i]-'0';
            if(digit!=0){
                sum+=digit;
                ans=ans*10+digit;
            }
        }
        return sum*ans;
    }
};