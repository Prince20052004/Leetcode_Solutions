class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum > num*9){
            return "";
        }
        StringBuilder result=new StringBuilder();
        int nines=sum/9;
        int remain=sum%9;
        for(int i=0; i<nines; i++){
            result.append('9');
        }
        if(remain>0){
            result.append(remain);
        }
        while(result.length()<num){
            result.append('0');
        }
        return result.toString();
    }
}