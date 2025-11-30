class Solution {
    public int mostWordsFound(String[] sentences) {
        int max_count =0;
        for(String k:sentences){
            String kas = k;
            int count =1;
            for(int j=0;j<k.length();j++){
                if(kas.charAt(j) == ' '){
                    count++;
                }
            }
            max_count = Math.max(count,max_count);
        }
        return max_count;
    }
}