class Solution {
    public String firstPalindrome(String[] words) {
        String ans = "";
        for(int i = 0;i<words.length;i++){
            String str = words[i];
            String rev = "";
            for(int j = str.length()-1;j>=0;j--){
                rev += str.charAt(j);
            }
            if(str.equals(rev)){
                return str;
            }
        }
        return "";
    }
}