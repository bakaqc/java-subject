package test_PE;

import java.util.*;

public class BST {

    private Node root;

    public BST() {
        this.root = null;
    }

    public void insert(Student student) {
        root = insertStd(root, student);
    }

    public Node insertStd(Node root, Student student) {
        if (root == null) {
            root = new Node(student) {
            };
            return root;
        }

        if (student.getId() < root.student.getId()) {
            root.left = insertStd(root.left, student);
        } else if (student.getId() > root.student.getId()) {
            root.right = insertStd(root.right, student);
        }

        return root;
    }

    public void traversal() {
        preorderTraversal(root);
    }

    public void preorderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.student + "\n");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    public int countAge20() {
        return countAgeTwenty(this.root);
    }

    public int countAgeTwenty(Node node) {
        int count = 0;
        if (node == null) {
            return 0;
        }
        Stack<Node> st = new Stack<>();
        st.push(root);

        while (!st.isEmpty()) {
            Node n = st.pop();
            if (n.student.getYearOfBirth() == 2003) {
                count++;
            }
            if (n.right != null) {
                st.push(n.right);
            }
            if (n.left != null) {
                st.push(n.left);
            }
        }
        return count;
    }

    public void deleteAge23() {
        deleteAgeTwentyThree(this.root);
    }

    public Node deleteAgeTwentyThree(Node node) {
        if (node == null) {
            return node;
        }
        node.left = deleteAgeTwentyThree(node.left);
        node.right = deleteAgeTwentyThree(node.right);

        if (node.student.getYearOfBirth() == 2000) {
//            node = deleteNode(node);
        }
        return node;
    }


    public static void main(String[] args) {
        BST bst = new BST();

        bst.insert(new Student(14, "Dinh Quoc Chuong", 2002, 3.5f));
        bst.insert(new Student(15, "Le Minh Vuong", 2001, 3.8f));
        bst.insert(new Student(7, "Nguyen Thi Thuy", 2003, 3.2f));
        bst.insert(new Student(6, "Ho Trong Nghia", 1999, 3.9f));
        bst.insert(new Student(9, "Trinh Minh Duong", 2000, 3.7f));
        bst.insert(new Student(11, "Huynh Le Trung", 1995, 3.6f));
        bst.insert(new Student(4, "Au Cong Danh", 1997, 3.4f));
        bst.insert(new Student(22, "Diep Minh Hung", 1998, 3.1f));
        bst.insert(new Student(18, "Le Dong Tam", 2003, 3.8f));
        bst.insert(new Student(27, "Nguyen Xuan Quy", 2000, 3.5f));

        System.out.println("Traverse the tree in preorder:\n");
        bst.traversal();

        System.out.println("\nNumber of students 20 age: " + bst.countAge20());

        System.out.println("\nList student after deletes all students 23 age:");
        bst.deleteAge23();
    }
}
