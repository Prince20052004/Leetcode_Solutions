// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

class Solution {
public:
    int firstBadVersion(int n) {
        int left=1, right=n;
        while(left<right){
            int mid=left+(right-left)/2;
            bool res=isBadVersion(mid);
            if(res){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return isBadVersion(left)? left: -1;
    }
};