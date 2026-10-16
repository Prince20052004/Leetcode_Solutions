class Solution {
public:
    int maximumBags(vector<int>& capacity, vector<int>& rocks, int additionalRocks) {
        int n=capacity.size();
        vector<int> required(n, 0);
        for(int i=0; i<n; i++){
            int curr=rocks[i];
            int cap=capacity[i];
            int req=cap-curr;
            required[i]=req;
        }
        sort(begin(required), end(required));
        int count=0;
        for(int i=0; i<n; i++){
            if(additionalRocks>=required[i]){
                additionalRocks-=required[i];
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
};