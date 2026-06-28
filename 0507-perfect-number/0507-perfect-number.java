class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num<= 1){
            return false;
        }
        int temp  = num;
        int sum = 1;
        for(int i = 2;i<=num/2;i++){
            if(num%i==0){
                sum += i;
              
            }
        }
        if(temp == sum){
            return true;
        }
        return false;
    }
}