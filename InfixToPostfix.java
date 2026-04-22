import java.util.Stack;

public class InfixToPostfix {

    // function to check precedence of operators
    static int precedence(char c) {
        if (c == '+' || c == '-') return 1;
        if (c == '*' || c == '/') return 2;
        return 0;
    }

    // main logic to convert infix to postfix
    public static String convert(String infix) {

        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        // go through each character
        for (char ch : infix.toCharArray()) {

            // if it's a letter/number → directly add
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            }

            // if opening bracket → push to stack
            else if (ch == '(') {
                stack.push(ch);
            }

            // if closing bracket → pop until '('
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop(); // remove '('
            }

            // if operator → check precedence
            else {
                while (!stack.isEmpty() &&
                        precedence(stack.peek()) >= precedence(ch)) {
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        // pop remaining operators
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }
}