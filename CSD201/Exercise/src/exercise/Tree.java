package exercise;

public class Tree {

    private Node root;

    public boolean isEmpty() {
        if (root == null) {
            return true;
        } else {
            return false;
        }
    }

    public void clear() {
        root = null;
    }

    public Node search(int info) {
        root = searchRecur(root, info);
        if (root != null) {
            return this.root;
        } else {
            return null;
        }
    }

    public Node searchRecur(Node root, int info) {
        if (root == null || root.data == info) {
            return root;
        }
        if (root.data > info) {
            return searchRecur(root.left, info);
        }
        return searchRecur(root.right, info);
    }
    
//    public Node insertRecur(Node root, int info){
//        if(root == null){
//            root = new Node(info);
//            return root;
//        }
//        
//        
//    }
}
