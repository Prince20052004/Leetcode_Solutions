class Solution {
public:
    bool uniformArray(vector<int>& nums1) {
        int minodd=INT_MAX;
        int mineven=INT_MAX;
        for(int num: nums1){
            if(num%2==0){
                mineven=min(mineven, num);
            }
            else{
                minodd=min(minodd, num);
            }
        }
        if(minodd==INT_MAX){
            return true;
        }
        if(mineven==INT_MAX){
            return true;
        }
        return minodd<mineven;
    }
};