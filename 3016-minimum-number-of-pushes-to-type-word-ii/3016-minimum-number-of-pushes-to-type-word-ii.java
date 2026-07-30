class Solution {
    public int minimumPushes(String word) {
        Integer[] mp=new Integer[26];
        Arrays.fill(mp, 0);
        for(char ch: word.toCharArray()){
            mp[ch-'a']++;
        }
        Arrays.sort(mp, Collections.reverseOrder());
        int result=0;
        for(int i=0; i<26; i++){
            int freq=mp[i];
            int press=i/8 +1;
            result+=press*freq;
        }
        return result;
    }
}