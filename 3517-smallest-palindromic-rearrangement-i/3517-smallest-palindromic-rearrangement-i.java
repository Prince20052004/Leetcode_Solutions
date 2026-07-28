class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        int mid=n/2;
        char[] fhalf=s.substring(0, mid).toCharArray();
        Arrays.sort(fhalf);
        StringBuilder sb=new StringBuilder();
        sb.append(fhalf);
        if(n%2!=0){
            sb.append(s.charAt(mid));
        }
        for(int i=mid-1; i>=0; i--){
            sb.append(fhalf[i]);
        }
        return sb.toString();
    }
}