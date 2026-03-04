class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        StringBuilder[] kas = new StringBuilder[numRows];
        for(int i=0;i<kas.length;i++){
            kas[i] = new StringBuilder();
        }
        int r =0;
        boolean godown = true;
        for(char k:s.toCharArray()){
            kas[r].append(k);
            if(r == numRows -1){
                godown = false;
            }
            else if (r == 0){
                godown =true;
            }
            if(godown){
                r++;
            }else{
                r--;
            }
        }
        StringBuilder res  = new StringBuilder();
        for(int y=0;y<numRows;y++){
          res.append(kas[y]); 
        }
        return res.toString();
    }
}
