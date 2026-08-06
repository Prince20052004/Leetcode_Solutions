class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int product=1;
            int copy=n;
            while(copy>0){
                int rightmostdigit=copy%10;
                product=product*rightmostdigit;
                copy=copy/10;
            }
            if(product%t==0)
                return n;
            n++;
        }
    }
}