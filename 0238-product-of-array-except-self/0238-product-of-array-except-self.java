//saif0666
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] soln = new int[nums.length];
        soln[0] = 1;
        for(int i = 1;i<nums.length;i++){
            soln[i] = soln[i-1] * nums[i-1];
        }
        int suffix = 1;
        for(int i = nums.length-1;i>=0;i--){
            soln[i] = soln[i] * suffix;
            suffix = nums[i] * suffix;
        }
        return soln;
    }
}