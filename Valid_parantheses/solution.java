class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()){
            if (c == '('){
                stack.push(')');
            }
            else if (c == '{'){
                stack.push('}');
            }
            else if (c == '['){
                stack.push(']');
            }
            else if (stack.isEmpty() || stack.pop() != c){
                return false;
            }
        }
        if (!stack.isEmpty()) return false;
        return true;
    }
}