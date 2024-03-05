package goldmansachs;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid_Tried2(String s) {
        boolean isValid = false;
        Stack<Character> openBrackets = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            isValid = false;
            char currentChar = s.charAt(i);
            if ("([{".contains(String.valueOf(currentChar))) {
                openBrackets.push(currentChar);
            } else if ("}])".contains(String.valueOf(currentChar))) {
                if (openBrackets.empty()) {
                    break;
                }
                char lastOpenBracket = openBrackets.pop();
                switch (currentChar) {
                    case ')':
                        isValid = lastOpenBracket == '(';
                        break;
                    case ']':
                        isValid = lastOpenBracket == '[';
                        break;
                    case '}':
                        isValid = lastOpenBracket == '{';
                        break;
                }
                if (!isValid) break;
            }
        }
        isValid = isValid && openBrackets.empty();
        return isValid;
    }

    public static void main(String[] args) {
//        String testString ="()[]{}";
//        String testString = "{[]}";
//        String testString = "(){}}{";
//        String testString = "({{{{}}}))";
//        String testString = ")(){}";
        String testString = "([]";
        System.out.println(ValidParentheses.isValid_Tried2(testString));
    }

}
