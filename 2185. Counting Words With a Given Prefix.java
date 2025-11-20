class Solution {
    public int prefixCount(String[] words, String pref) {
        int count =0 ;
        for(String k:words){
            if(k.startsWith(pref)){
                count++;
            }
        }
        return count;
    }
}