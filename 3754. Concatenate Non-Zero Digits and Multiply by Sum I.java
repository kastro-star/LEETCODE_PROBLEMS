class Solution {
    public long sumAndMultiply(int n) {
        if( n == 0){
            return (long) n;
        }
        String kas = String.valueOf(n);
        StringBuilder kast = new StringBuilder();
        int sum = 0;
        for(int i = 0;i<kas.length();i++){
            char k =  kas.charAt(i);
            if(k != '0'){
                kast.append(k);
                sum = sum + k - '0';
            }
        }
        
        Long fin = Long.parseLong(kast.toString());
        return fin*sum;
    }
}