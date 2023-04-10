class Solution {
    public boolean isValid(String s1) {
        Stack<Character>s = new Stack<Character>();
        for(char ch : s1.toCharArray()){
            if(ch == '('){
                s.push(')');
            }
            else if(ch == '{'){
                s.push('}');
            }
            else if(ch == '['){
                s.push(']');
            }
            else if(s.isEmpty() || s.pop() != ch){
                return false;
            }
        }
        return s.isEmpty();
    }
}
