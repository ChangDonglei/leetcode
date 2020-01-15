class ValidParentheses {
public boolean isBracket(String s) {

        //abnormal check
        if (s.trim().equals("")) {
            return true;
        } else if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> leftStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character cur = s.charAt(i);
            if (cur == '(' || cur == '{' || cur == '[') {
                leftStack.push(cur);
            } else {
                if (leftStack.isEmpty()) {//right bracket is more than left one
                    return false;
                }
                Character pops = leftStack.pop();
                if (cur == ')' && pops == '(' || cur == '}' && pops == '{' || cur == ']' && pops == '[') {
                    continue;
                } else {
                    return false;
                }
            }
        }
        //left bracket is more than right one
        if (leftStack.isEmpty()) {
            return true;
        }
        return false;
    }


}
