import java.util.Stack;

public class ValidParentheses {
        public static boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();

            for (char c : s.toCharArray()) {
                switch (c) {
                    case '(':
                        stack.push(')');
                        break;
                    case '{':
                        stack.push('}');
                        break;
                    case '[':
                        stack.push(']');
                        break;
                    default:
                        if (stack.isEmpty() || stack.pop() != c) {
                            return false;
                        }
                }
            }

            return stack.isEmpty();
        }

        public static void main(String[] args) {
            // Test cases
            System.out.println(isValid("()"));       // true
            System.out.println(isValid("()[]{}"));   // true
            System.out.println(isValid("(]"));       // false
            System.out.println(isValid("([])"));     // true
        }
}
