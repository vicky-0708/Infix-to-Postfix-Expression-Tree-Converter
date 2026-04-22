public class Traversal {

    // inorder traversal
    public static String inorder(ExpressionTree.Node root) {
        if (root == null) return "";
        return inorder(root.left) + root.data + " " + inorder(root.right);
    }

    // preorder traversal
    public static String preorder(ExpressionTree.Node root) {
        if (root == null) return "";
        return root.data + " " + preorder(root.left) + preorder(root.right);
    }

    // postorder traversal
    public static String postorder(ExpressionTree.Node root) {
        if (root == null) return "";
        return postorder(root.left) + postorder(root.right) + root.data + " ";
    }
}
