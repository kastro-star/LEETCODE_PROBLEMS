class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] result = new int[friends.length];
        int l=0;
        for(int i =0 ;i<order.length;i++){
            int k = order[i];
            if(check(k,friends)){
                result[l++] = order[i];
            }
        }
        return result;    
    }
    public boolean check(int val,int[] friends){
        for(int i=0;i<friends.length;i++){
            if(friends[i] == val){
                return true;
            }
        }
        return false;
    } 
}