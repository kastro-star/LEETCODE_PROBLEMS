class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int count = 0,rig=nums.size() - 1,lef =0;
        while(lef<rig){
            if(nums.get(rig)+nums.get(lef) < target){
                count += rig - lef;
                lef++;
            }
            else{
                rig--;
            }
        }
        return count;

    }
}