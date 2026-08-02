class Solution {
public:
    int buyChoco(vector<int>& prices, int money) {
        int minprice=INT_MAX;
        int secprice=INT_MAX;
        for(int price: prices){
            if(price<minprice){
                secprice=minprice;
                minprice=price;
            }
            else{
                secprice=min(secprice,price);
            }
        }
        if(minprice+secprice>money){
            return money;
        }
        return money-(minprice+secprice);
    }
};