class Solution {
    public String longestCommonPrefix(String[] strs) {
        int k=0;
        if (strs.length ==0 || strs ==null){
            return "";
        }
        String kas=strs[0];
        for(String k:strs){
            while(!k.startsWith(kas)){
                kas=kas.substring(0,kas.length()-1);
                if(kas.isEmpty()){
                    return "";
                }
            }
        }
        return kas;
        
    }
}