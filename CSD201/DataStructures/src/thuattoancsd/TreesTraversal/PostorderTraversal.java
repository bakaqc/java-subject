package thuattoancsd.TreesTraversal;

public class PostorderTraversal {

    Node root;

    // Post-order traversal method
    void postorderTraversal(Node node) {
        if (node == null) {
            return;
        }

        // Recursively traverse left subtree
        postorderTraversal(node.left);

        // Recursively traverse right subtree
        postorderTraversal(node.right);

        // Print the value of the current node
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        // Create a binary tree
        PostorderTraversal tree = new PostorderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // Print nodes using post-order traversal
        System.out.print("Post-order traversal: ");
        tree.postorderTraversal(tree.root);
    }

}
