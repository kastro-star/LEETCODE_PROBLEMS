class Solution {
    public String longestPalindrome(String s) {
        int len=0;
        String kas ="";
        for(int i =0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub = s.substring(i,j+1);
                if(ispalid(sub) && sub.length() > len){
                    kas= sub;
                    len =sub.length();
                }
            }
        }
        return kas;
    }
    static boolean ispalid(String k){
        for(int i=0, j=k.length() - 1;i<j;i++,j--){
            if(k.charAt(i)!=k.charAt(j)){
                return false;
            } 
        }
        return true;
    }  
    }