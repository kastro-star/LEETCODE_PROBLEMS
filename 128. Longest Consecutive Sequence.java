class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;
        Set<Integer> kas = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            kas.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            int count =1;
            int num = nums[i];
            while(kas.contains(--num)){
                count++;
                kas.remove(num);
            }
            num = nums[i];
            while(kas.contains(++num)){
                count++;
                kas.remove(num);
            }
            max = Math.max(count,max);
        }
        return max;
    }
}