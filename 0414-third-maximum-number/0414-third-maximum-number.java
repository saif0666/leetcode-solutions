//saif0666
class Solution {
    public int thirdMax(int[] nums) {
       Long max1 = null;
       Long max2 = null;
       Long max3 = null;
       for(int num:nums){
        long i = num;
        if(max1 != null && i == max1 ||
        max2 != null && i == max2 ||
        max3 != null && i == max3){
            continue;
        }
        if(max1 == null || i>max1){
            max3 = max2;
            max2 = max1;
            max1 = i;
        }
        else if(max2 == null || i > max2){
            max3 = max2;
            max2 = i;
        }
        else if(max3 == null || i > max3){
            max3 = i;
        }
       }
       return max3 == null? max1.intValue() : max3.intValue();
    }
}