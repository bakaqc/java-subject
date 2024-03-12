package exercise;

public class Node {

    public Node root;
    public Node left;
    public Node right;
    public int data;

    public Node() {
        this.root = this.left = this.right = null;
        this.data = 0;
    }

    public Node(Node root, Node left, Node right, int data) {
        this.root = root;
        this.left = left;
        this.right = right;
        this.data = data;
    }

}
