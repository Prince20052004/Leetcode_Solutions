class Solution {
public:
    bool isvowel(char &ch){
        return (ch=='o'||ch=='i'||ch=='a'||ch=='u'||ch=='e'||ch=='O'||ch=='I'||ch=='A'||ch=='U'||ch=='E');
    }
    bool halvesAreAlike(string s) {
        int n=s.length();
        int mid=n/2;
        int i=0, j=mid;
        int countL=0;
        int countR=0;
        while(i<n/2 && j<n){
            if(isvowel(s[i]))
                countL++;
            if(isvowel(s[j]))
                countR++;
            i++;
            j++;
        }
        return countL==countR;
    }
};