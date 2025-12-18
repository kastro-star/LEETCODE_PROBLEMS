class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> kas = new Stack<>();
        StringBuilder  finalval = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                if(kas.size() > 0){
                    finalval.append(s.charAt(i));
                }
                kas.push(s.charAt(i));
            }
            else{
                kas.pop();
                if(kas.size() > 0){
                    finalval.append(s.charAt(i));
                }
            }
        } 
        return finalval.toString();
    }
}
