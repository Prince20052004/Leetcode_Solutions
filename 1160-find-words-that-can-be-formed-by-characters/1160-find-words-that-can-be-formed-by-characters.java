class Solution {
    public int countCharacters(String[] words, String chars) {
        char[] charcount=new char[26];
        for(char ch: chars.toCharArray()){
            charcount[ch-'a']++;
        }
        int result=0;
        for(String word: words){
            char[] wordcount=new char[26];
            for(char ch: word.toCharArray()){
                wordcount[ch-'a']++;
            }
            boolean ok=true;
            for(int i=0; i<26; i++){
                if(wordcount[i]>charcount[i]){
                    ok=false;
                    break;
                }
            }
            if(ok==true){
                result+=word.length();
            }
        }
        return result;
    }
}