//saif0666
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int sec = 0;
        for (int i = 1;i<timeSeries.length;i++){
            int gap = timeSeries[i] - timeSeries[i-1];
            sec += Math.min(gap,duration);

        }
        return sec + duration;
    }
}