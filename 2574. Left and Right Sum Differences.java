class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] lefa = new int[n];
        int[] riga = new int[n];
        int[] ans = new int[n];
        for(int i=1;i<n ;i++){
            lefa[i]= lefa[i - 1] + nums[i - 1];
        }
        for(int j =n-2;j>=0;j--){
            riga[j] = riga[j+1]+nums[j+1];
        }
        for(int i =0;i<n;i++){
            ans[i] = Math.abs(lefa[i] - riga[i]);
        }
        return ans;
    }
}