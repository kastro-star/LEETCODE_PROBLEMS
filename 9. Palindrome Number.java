class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int cpy =x;
        int ans =0;
        int rem=0;
        while(x>0){
            rem =x%10;
            x=x/10;
            ans =ans*10+rem;
        }
        return ans==cpy;
        
    }
}