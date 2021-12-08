package stack_queue;

import java.util.Stack;

public class _20_Valid_Parentheses {
    public static boolean isValid(String s) {
        Stack<Character> characterStack = new Stack<>();
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if (c == '(' | c == '[' | c == '{')
                characterStack.push(c);
            else {
                if (characterStack.isEmpty())
                    return false;
                char value = characterStack.peek();
                if (!((c == ')' && value == '(') |
                        (c == ']' && value == '[') |
                        (c == '}' && value == '{')))
                    return false;
                characterStack.pop();
            }
        }
        return characterStack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("{[()]}"));
    }
}
