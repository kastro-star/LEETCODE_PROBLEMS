class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] kas = new int[points.length];
        for(int i =0;i<points.length;i++){
                kas[i] = points[i][0];
        }
        Arrays.sort(kas);
        int max =0;
        int temp ;
        for(int i =0;i<kas.length -1 ;i++){
            temp = kas[i+1] - kas[i];
            if(max < temp){
                max =temp;
            }
        }
        return max;  
    }
}