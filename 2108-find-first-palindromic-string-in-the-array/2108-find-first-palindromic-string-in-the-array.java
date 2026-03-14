//saif0666
class Solution {
    public String firstPalindrome(String[] words) {
        for(String str:words){
            int left = 0;
            int right = str.length()-1;
            while(left<=right){
                if(str.charAt(left)!=str.charAt(right)){
                    break;
                }
                left++;
                right--;
            }
            if(left>=right){
                return str;
            }
        }
        return "";
    }
}