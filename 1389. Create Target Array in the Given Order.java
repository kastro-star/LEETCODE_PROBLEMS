class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] res = new int[index.length];
        for(int i =0;i<nums.length;i++){
            int tarindex = index[i];
            for(int j= i;j>tarindex;j--){
                res[j] = res[j-1];
            }
            res[tarindex] =nums[i];

        }
        return res;
    }
}