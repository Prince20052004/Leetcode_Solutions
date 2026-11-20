class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        StringBuilder[] temp=new StringBuilder[numRows];
        for(int i=0; i<numRows; i++){
            temp[i]=new StringBuilder();
        }
        int j=0;
        boolean flag=false;
        StringBuilder answer=new StringBuilder();
        for(int i=0; i<s.length(); i++){
            temp[j].append(s.charAt(i));
            if(j==numRows-1 || j==0){
                flag=!flag;
            }
            if(flag){
                j++;
            }
            else{
                j--;
            }
        }
        for(int i=0; i<numRows; i++){
            answer.append(temp[i]);
        }
        return answer.toString();
    }
}