import java.util.*;
//saif0666
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int i = num.length - 1;

        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];   // add last digit
                i--;
            }
            result.add(k % 10); // store last digit of sum
            k /= 10;            // carry goes into k
        }

        Collections.reverse(result);
        return result;
    }
}
