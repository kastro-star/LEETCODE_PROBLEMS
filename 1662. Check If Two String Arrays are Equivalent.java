class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder kas = new StringBuilder();
        StringBuilder kas2 = new StringBuilder();
        for(int i =0;i<word1.length;i++){
            kas.append(word1[i]);
        }
        for(int k=0;k<word2.length;k++){
            kas2.append(word2[k]);
        }

        String h = kas.toString();
        String k = kas2.toString();
        if(h.equals(k)){
            return true;
        }
        return false;   
    }
}