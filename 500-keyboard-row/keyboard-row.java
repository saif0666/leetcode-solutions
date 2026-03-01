class Solution {
    public String[] findWords(String[] words) {
       String row1 = "qwertyuiop";
       String row2 = "asdfghjkl";
       String row3 = "zxcvbnm";
       List<String>result = new ArrayList<>();
       for(String word: words){
            String lower = word.toLowerCase();
            if(row1.contains(""+lower.charAt(0))){
                if(checkWord(lower,row1)) result.add(word);
            }
            else if(row2.contains(""+lower.charAt(0))){
                if(checkWord(lower,row2)) result.add(word);
            }
            else{
                 if(checkWord(lower,row3)) result.add(word);
            }
       } 
       return result.toArray(new String[0]);
    }
    private boolean checkWord(String word, String row){
        for(char c: word.toCharArray()){
            if(!row.contains(""+c))return false;
        }
        return true;
    }
}
