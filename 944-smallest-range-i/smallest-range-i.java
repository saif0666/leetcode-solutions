//saif0666
class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int mn = Integer.MAX_VALUE;
        int mx = Integer.MIN_VALUE;
        for(int v: nums){
            mn = Math.min(mn,v);
            mx = Math.max(mx,v);
        }
        return Math.max(0,(mx-mn)-2*k);
    }
}