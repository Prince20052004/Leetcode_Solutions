class Solution {
    public int minimumPushes(String word) {
        int result=0;
        int[] mp=new int[10];
        int assign=2;
        for(char ch: word.toCharArray()){
            if(assign>9){
                assign=2;
            }
            mp[assign]++;
            result+=mp[assign];
            assign++;
        }
        return result;
    }
}