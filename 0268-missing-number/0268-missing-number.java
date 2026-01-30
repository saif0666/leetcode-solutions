//saif0666
class Solution {
    public int missingNumber(int[] nums) {
       
            // int ans = 0;
            // for(int x = 0;x<=nums.length;x++){
            //     int count = 0;
            //     for(int i = 0; i<nums.length;i++){
            //         if(x == nums[i]){
            //             count++;
            //             break;
            //         }
                    
            //     }
            
            //     if(count == 0){
            //         ans = x;
            //         break;
            //     }
                
            // } 
            // return ans;  
        int n = nums.length;
        int expected_soln = n*(n+1)/2;
        int actual_soln = 0;
        for(int i = 0;i<nums.length;i++){
            actual_soln += nums[i];
        }
        return expected_soln-actual_soln;
    }
}