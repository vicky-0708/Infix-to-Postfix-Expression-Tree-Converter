import javax.swing.*;

public class Main {

    // just a simple check to avoid wrong inputs
    static boolean isValid(String exp) {

        if (exp == null || exp.length() == 0)
            return false;

        // checking each character one by one
        for (char ch : exp.toCharArray()) {

            // only allow letters, operators and brackets
            if (!(Character.isLetter(ch) ||
                  ch == '+' || ch == '-' ||
                  ch == '*' || ch == '/' ||
                  ch == '(' || ch == ')')) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        // creating main window
        JFrame frame = new JFrame("Expression Tree Converter");

        // label to guide user
        JLabel label = new JLabel("Enter Infix Expression:");
        label.setBounds(50, 30, 200, 30);

        // input box
        JTextField input = new JTextField();
        input.setBounds(50, 70, 500, 35);

        // button to perform action
        JButton button = new JButton("Convert");
        button.setBounds(230, 120, 120, 40);

        JTextArea output = new JTextArea();
        output.setEditable(false);

        JScrollPane scroll = new JScrollPane(output);
        scroll.setBounds(50, 180, 500, 180);

        frame.setLayout(null);

        // adding everything to frame
        frame.add(label);
        frame.add(input);
        frame.add(button);
        frame.add(scroll);

        button.addActionListener(e -> {

            String infix = input.getText();

            // checking if input is valid
            if (!isValid(infix)) {
                output.setText("Invalid expression!");
                return;
            }

            try {
                // converting infix to postfix
                String postfix = InfixToPostfix.convert(infix);

                // building expression tree
                ExpressionTree.Node root = ExpressionTree.buildTree(postfix);

                // getting traversal outputs
                String inorder = Traversal.inorder(root);
                String preorder = Traversal.preorder(root);
                String postorder = Traversal.postorder(root);

                // final result to show
                String result = "Postfix: " + postfix +
                        "\n\nInorder: " + inorder +
                        "\nPreorder: " + preorder +
                        "\nPostorder: " + postorder;

                // display in output box
                output.setText(result);

            } catch (Exception ex) {
                // inavlid inpu handling
                output.setText("Invalid expression!");
            }
        });

        
        frame.setSize(620, 450);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
