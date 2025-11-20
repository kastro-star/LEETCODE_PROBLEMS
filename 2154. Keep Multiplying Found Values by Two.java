class Solution {
    public int findFinalValue(int[] nums, int original) {
    while(check(original,nums)){
        original = original * 2;
        }
        return original; // hi   vdvd
    }//c
    public boolean check(int val,int[] nums){
        for(int i=0;i<nums.length;i++){
            if(val == nums[i]){ 
                return true;
            }
        }
        return false;
    }
}
