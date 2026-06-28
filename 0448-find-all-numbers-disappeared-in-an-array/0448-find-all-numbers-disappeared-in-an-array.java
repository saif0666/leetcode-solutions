class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        List<Integer> Result = new ArrayList<>();
        for(int i = 1;i<nums.length+1;i++){
            if(!set.contains(i)){
                Result.add(i);
            }
        }
        return Result;
    }
}