
import java.util.Stack;

public class ExpressionTree {

    // make Node static
    static class Node {
        char data;
        Node left, right;

        Node(char data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node buildTree(String postfix) {
        Stack<Node> stack = new Stack<>();

        for (char ch : postfix.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                stack.push(new Node(ch));
            } else {
                Node right = stack.pop();
                Node left = stack.pop();

                Node node = new Node(ch);
                node.left = left;
                node.right = right;

                stack.push(node);
            }
        }

        return stack.pop();
    }
}
