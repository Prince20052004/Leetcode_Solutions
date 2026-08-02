class Solution {
    public int buyChoco(int[] prices, int money) {
        int minprice=Integer.MAX_VALUE;
        int secprice=Integer.MAX_VALUE;
        for(int price: prices){
            if(price<minprice){
                secprice=minprice;
                minprice=price;
            }
            else{
                secprice=Math.min(secprice,price);
            }
        }
        if(minprice+secprice>money){
            return money;
        }
        return money-(minprice+secprice);
    }
}