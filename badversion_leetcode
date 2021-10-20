/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
int i;
    public int firstBadVersion(int n) {
        
        int left =1 ;
        int right = n;
        
        while(left<right)
        {
        int mid = left + (right-left)/2;
        if (firstBadVersion(mid))
        {
            right = mid;     
        }
        else
        {
            left = mid+1;
        }
    }
}
