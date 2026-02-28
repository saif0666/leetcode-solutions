//saif0666
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>arr = new HashSet<>();
        HashSet<Integer>result = new HashSet<>();
        for(int num:nums1){
            arr.add(num);
        }
        for(int num:nums2){
            if(arr.contains(num)){
                result.add(num);
            }
        }
        int[] ans = new int[result.size()];
        int i = 0;
        for(int num:result){
            ans[i++] = num;
        }
        return ans;
    }
}