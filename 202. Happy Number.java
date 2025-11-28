class Solution {
    public boolean isHappy(int n) {
        Set<Integer> serr = new HashSet<>();
        int sum,rem;
        while(serr.add(n)){
            sum = 0;
            while(n > 0){
                rem = n % 10;
                sum += rem * rem;
                n /= 10;
            }
            if(sum  == 1){
                return true;
            }
            n = sum;
            }
        
        return false;
    }
}