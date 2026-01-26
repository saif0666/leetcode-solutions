//saif0666
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        while(numBottles>=numExchange){
            int remBottles = numBottles % numExchange;
            int newBottles = numBottles / numExchange;
            numBottles = remBottles + newBottles;
            ans = ans + newBottles;
        }
        return ans;
    }
}