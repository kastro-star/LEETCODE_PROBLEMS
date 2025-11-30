class Solution {
    public int numberOfBeams(String[] bank) {
        int val =0,prev =0,fin =0;
        for(int i=0;i<bank.length;i++){
            String r =bank[i];
            char[] kas =r.toCharArray();
            int j =0;
            int count =0;
            while(j < kas.length){
                if(kas[j++] == '0'){
                    continue;
                }
                else{
                    count++;
                }
            }
            fin +=count  * prev;
            if(count > 0){
                prev =count;
            }
        }
        return fin;
    }
}