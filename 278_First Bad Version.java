// Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 0, high = n;
        while(low < high){   
            int mid = low + (high - low)/2;         
            if(isBadVersion(mid)){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}
