package qe170097_dinhquocchuong_pe_csd201;

import java.util.*;

public class BST {

    private Node root;

    public BST() {
        this.root = null;
    }

//  Insert student to the BST
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

//  Level Order Traversal use Queue
    public void levelOrderTraversal() {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        System.out.format("%-15s%-20s%-20s%-10s\n", "ID", "Name", "Year of Birth", "AVG");
        while (!queue.isEmpty()) {
            Node node = queue.poll();

            System.out.format("%-15s%-20s%-20s%-10s\n", node.student.getId(), node.student.getFullname(), node.student.getYearOfBirth(), node.student.getAvg());

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

//  Traverse Order Descending
    public void traverseDescending() {
        System.out.format("%-15s%-20s%-20s%-10s\n", "ID", "Name", "Year of Birth", "AVG");
        traverseDescending(root);
    }

    private void traverseDescending(Node node) {
        if (node == null) {
            return;
        }
        traverseDescending(node.right);
        System.out.format("%-15s%-20s%-20s%-10s\n", node.student.getId(), node.student.getFullname(), node.student.getYearOfBirth(), node.student.getAvg());
        traverseDescending(node.left);
    }

// Count number of students have avg < 5
    public int countAvg() {
        return countAvg(this.root);
    }

    public int countAvg(Node node) {
        if (node == null) {
            return 0;
        }

        int count = countAvg(node.left) + countAvg(node.right);

        if (node.student.getAvg() < 5) {
            count++;
        }

        return count;
    }

    public void deleteAge19(Node node) {
        if (node == null) {
            return;
        }

        deleteAge19(node.left);
        deleteAge19(node.right);

        if (node.student.getYearOfBirth() == 2004) {
            deleteNode(node.student.getId());
        }
    }

    public void deleteNode(int id) {
        root = deleteNode(root, id);
    }

    public Node deleteNode(Node root, int id) {
        if (root == null) {
            return null;
        }

        if (id < root.student.getId()) {
            root.left = deleteNode(root.left, id);
        } else if (id > root.student.getId()) {
            root.right = deleteNode(root.right, id);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            Node minNode = findMinNode(root.right);
            root.student = minNode.student;
            root.right = deleteNode(root.right, minNode.student.getId());
        }

        return root;
    }

    public Node findMinNode(Node node) {
        while (node.left != null) {
            node = node.left;
        }

        return node;
    }

    public void convert(int n) {        
        if(n > 0){
            
            System.out.println(" " + n % 5);
            convert(n);
        }
    } 

    public static void main(String[] args) {
        BST bst = new BST();
//        bst.insert(new Student(1, "Dinh Quoc Chuong", 2003, 8));
//        bst.insert(new Student(3, "Dinh Quoc A", 2004, 3));
//        bst.insert(new Student(12, "Dinh Quoc B", 2001, 6));
//        bst.insert(new Student(15, "Dinh Quoc C", 2000, 4.8));
//        bst.insert(new Student(7, "Dinh Quoc D", 2006, 7.5));
//        bst.insert(new Student(2, "Dinh Quoc E", 2003, 8));
//        bst.insert(new Student(9, "Dinh Quoc F", 2004, 6));
//        bst.insert(new Student(6, "Dinh Quoc G", 2005, 6.5));
//        bst.insert(new Student(13, "Dinh Quoc H", 2002, 4));
//        bst.insert(new Student(4, "Dinh Quoc I", 2000, 3));
//
//        System.out.println("Level Order Traversal:");
//        bst.levelOrderTraversal();
//
//        System.out.println();
//        System.out.println("Descending Order Traversal:");
//        bst.traverseDescending();
//
//        System.out.println();
//        System.out.println("Number of Student have AVG < 5: " + bst.countAvg());
//
//        System.out.println("Students with Age 19 has deleted!");
//        bst.deleteAge19(bst.root);
//
//    }
//
// 
bst.convert(33);
    }
}
