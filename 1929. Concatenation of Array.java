class Solution {
    public int[] getConcatenation(int[] nums) {
        int count =0;
        int[] kas = new int[nums.length + nums.length];
        for(int k:nums){
            kas[count++]=k;
        }
        for(int k:nums){
            kas[count++]=k;
        }
        return kas; 
        
    }
}