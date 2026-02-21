//saif0666
class Solution {
    public int minMoves(int[] nums) {
        int max = 0;
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
            sum += nums[i];
        }
        max *= nums.length;
        return (max - sum);
        // int count = 0;
        // for(int i = 0;i<nums.length;i++){
        //     while(nums[i] != max){
        //         count++;
        //         nums[i] += 1; 
        //     }
        // }
        // return count;
    }
}