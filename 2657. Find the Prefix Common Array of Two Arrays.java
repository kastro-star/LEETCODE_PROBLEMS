class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int arr[] = new int[A.length];
        int arrA[] = new int[51];
        int arrB[] = new int[51];
        int count =0;
        for(int i=0;i<A.length;i++){
            arrA[A[i]] = 1;
            arrB[B[i]] = 1;
            if(A[i] == B[i]){
                count++;
                arr[i] = count;
                continue;
            }
            if(arrA[B[i]] != 0){
                count++;
            }
            if(arrB[A[i]] != 0){
                count++;
            }
            arr[i] = count;
        }
        return arr;
    }
}