class Solution {
    public int minOperations(String s) {
        int n=s.length();
        boolean sorted=true;
        for(int i=0; i<n-1; i++){
            if(s.charAt(i)>s.charAt(i+1)){
                sorted=false;
                break;
            }
        }
        if(sorted){
            return 0;
        }
        if(n==2){
            return -1;
        }
        char minchar='z';
        char maxchar='a';
        for(int i=0; i<n; i++){
            char c=s.charAt(i);
            if(c<minchar){
                minchar=c;
            }
            if(c>maxchar){
                maxchar=c;
            }
        }
        char first=s.charAt(0);
        char last=s.charAt(n-1);
        if(first==minchar || last==maxchar){
            return 1;
        }
        int mincount=0;
        int maxcount=0;
        for(int i=0; i<n; i++){
            if(s.charAt(i)==minchar){
                mincount++;
            }
            if(s.charAt(i)==maxchar){
                maxcount++;
            }
        }
        if(first==maxchar && last==minchar && mincount==1 && maxcount==1){
            return 3;
        }
        return 2;
    }
}