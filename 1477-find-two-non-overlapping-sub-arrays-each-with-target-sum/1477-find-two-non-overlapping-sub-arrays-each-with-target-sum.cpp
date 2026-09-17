class Solution {
public:
    int minSumOfLengths(vector<int>& arr, int target) {
        int n=arr.size();
        int i=0;
        int j=0;
        int currsum=0;
        vector<int> minbestlen(n, INT_MAX);
        int bestminlen=INT_MAX;
        int result=INT_MAX;
        while(j<n){
            currsum +=arr[j];
            while(i<j && currsum>target){
                currsum-=arr[i++];
            }
            if(currsum==target){
                int len=j-i+1;
                if(i>0 && minbestlen[i-1]!=INT_MAX){
                    result=min(result, len+minbestlen[i-1]);
                }
                bestminlen=min(bestminlen, len);
            }
            minbestlen[j]=bestminlen;
            j++;
        }
        return result==INT_MAX? -1:result;
    }
};