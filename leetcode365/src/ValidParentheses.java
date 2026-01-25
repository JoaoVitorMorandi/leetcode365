import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("()()()()(){}[]{}[]{}"));
    }

    public static boolean isValid(String s) {
        if(s.length()%2 > 0) return false;
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
                continue;
            }
            if(stack.empty()) return false;
            if(c == ')' && stack.peek() != '('){
                return false;
            }
            if(c == '}' && stack.peek() != '{'){
                return false;
            }
            if(c == ']' && stack.peek() != '['){
                return false;
            }
            stack.pop();
        }

        return stack.empty();
    }
}
