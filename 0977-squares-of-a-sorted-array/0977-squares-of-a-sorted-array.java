//saif0666 
import java.util.Arrays;
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] soln = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            soln[i] = nums[i]*nums[i];
        }
        // int max = 0;
        // for(int i = 0;i<soln.length;i++){

        // }
        Arrays.sort(soln);
        return soln;
    }
}