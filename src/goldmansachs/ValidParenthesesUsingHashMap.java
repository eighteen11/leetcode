package goldmansachs;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesesUsingHashMap {
    public static boolean isValid(String s) {
        HashMap<Character, Character> parenthesesMap = new HashMap<>() {{
            put('(', ')');
            put('{', '}');
            put('[', ']');
        }};
        Stack<Character> parenthesesStack = new Stack<>();
        for (char c :
                s.toCharArray()) {
            if (parenthesesMap.containsKey(c)) {
                parenthesesStack.push(c);
            } else {
                if (!parenthesesStack.isEmpty() && c == parenthesesMap.get(parenthesesStack.peek())) {
                    parenthesesStack.pop();
                } else {
                   return  false;
                }
            }
        }
        return parenthesesStack.empty();
    }


    public static void main(String[] args) {
//        String testString = "(){{})";
//        String testString = "()";
//        String testString = "()[]{}";
//        String testString = "{[]}";
        String testString = "([]){";
//        String testString = "({{{{}}}))";
//        String testString = ")(){}";
//        String testString = "))";
        System.out.println(isValid(testString));
    }
}
