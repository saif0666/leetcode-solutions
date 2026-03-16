//saif0666
class Solution {
    public int differenceOfSum(int[] nums) {
        int element_sum = 0;
        int digit_sum = 0;
        for(int i = 0;i<nums.length;i++){
            element_sum += nums[i];
            if(nums[i]>9){
                while(nums[i]>0){
                    digit_sum += nums[i]%10;
                    nums[i] /= 10;
                }
            }
            digit_sum += nums[i];
        }
        return Math.abs(element_sum-digit_sum);
    }
}