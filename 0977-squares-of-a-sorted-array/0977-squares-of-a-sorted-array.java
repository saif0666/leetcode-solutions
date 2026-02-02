//saif0666 
import java.util.Arrays;
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] soln = new int[nums.length];
        int start = 0;
        int end = nums.length-1;
        int index = soln.length-1;
        while(start<=end){
            int st = nums[start] * nums[start];
            int ed = nums[end] * nums[end];
            if(st>ed){
                soln[index] = st;
                
                start++;
            }
            else{
                soln[index] = ed;
                
                end--;
            }
            index--;
        }
        // for(int i = 0;i<nums.length;i++){
        //     soln[i] = nums[i]*nums[i];
        // }
        // // int max = 0;
        // // for(int i = 0;i<soln.length;i++){

        // // }
        // Arrays.sort(soln);
        return soln;
    }
}