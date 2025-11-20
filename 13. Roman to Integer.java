class Solution {
    public int romanToInt(String s) {
        //int res=0;
        Map<Character,Integer> st=new HashMap<>();
        st.put('I', 1);
        st.put('V', 5);
        st.put('X', 10);
        st.put('L', 50);
        st.put('C', 100);
        st.put('D', 500);
        st.put('M', 1000);

        int res=0;
        for(int i=0; i< s.length()-1;i++){
            if(st.get(s.charAt(i))<st.get(s.charAt(i+1))){
                res=res-st.get(s.charAt(i));

            }
            else{
                res=res+st.get(s.charAt(i));
            }
        }
        res=res+st.get(s.charAt(s.length()-1));

        return res;
        
        
    }
}