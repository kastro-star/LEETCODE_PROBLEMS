class Solution {
    public int balancedStringSplit(String s) {
        int sum = 0;
        int result =0;
        for(char k:s.toCharArray()){
            int l=0;
            if(k == 'R'){
                l= 1;
            }
            else{
                l=-1;
            }
            sum +=l;
            if(sum == 0){
                result++;
            }
        }
        return result;
    }
}