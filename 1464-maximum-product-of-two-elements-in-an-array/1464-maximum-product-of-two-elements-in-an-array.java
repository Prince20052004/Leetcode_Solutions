class Solution {
    public int maxProduct(int[] nums) {
        int largest=0;
        int seclargest=0;
        for(int num: nums){
            if(num>largest){
                seclargest=largest;
                largest=num;
            }
            else{
                seclargest=Math.max(seclargest, num);
            }
        }
        return (largest-1)*(seclargest-1);
    }
}