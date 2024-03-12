package thuattoancsd.TreesTraversal;

public class PreorderTraversal {

    Node root;

    public PreorderTraversal() {
        root = null;
    }

    // Recursive method to perform pre-order traversal
    private void preOrderTraversal(Node node) {
        if (node == null) {
            return;
        }

        // Visit the current node first
        System.out.print(node.data + " ");

        // Traverse the left subtree
        preOrderTraversal(node.left);

        // Traverse the right subtree
        preOrderTraversal(node.right);
    }

    // Method to start pre-order traversal from the root
    public void preOrder() {
        preOrderTraversal(root);
    }

    public static void main(String[] args) {
        // Create a binary tree
        PreorderTraversal tree = new PreorderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // Perform pre-order traversal
        System.out.println("Pre-order traversal:");
        tree.preOrder();
    }
}
