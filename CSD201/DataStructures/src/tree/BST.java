package tree;

import java.util.*;

public class BST {

    private Node root;

    public BST() {
        this.root = null;
    }

    public void insert(int value) {
        this.root = this.insertImpl(this.root, value);
    }

    private Node insertImpl(Node node, int value) {
        if (node == null) {
            node = new Node(value);

            return node;
        }

        if (value < node.data) {
            node.left = this.insertImpl(node.left, value);
        } else if (value > node.data) {
            node.right = this.insertImpl(node.right, value);
        }

        return node;
    }

    public void dfs() {
        this.preoder();
    }

    private void preoder() {
        this.preoderImpl(this.root);
    }

    private void preoderImpl(Node node) {
        if (node != null) {
            System.out.println(node.data);

            this.preoderImpl(node.left);
            this.preoderImpl(node.right);
        }
    }

    private void inoder() {
        this.inoderImpl(this.root);
    }

    private void inoderImpl(Node node) {
        if (node != null) {
            this.inoderImpl(node.left);

            System.out.println(node.data);

            this.inoderImpl(node.right);
        }
    }

    private void postoder() {
        this.postoderImpl(this.root);
    }

    private void postoderImpl(Node node) {
        if (node != null) {
            this.postoderImpl(node.left);
            this.postoderImpl(node.right);

            System.out.println(node.data);
        }
    }

    public void bfs() {
        if (this.root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(this.root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.println(current.data);

            if (current.left != null) {
                queue.offer(current.left);
            }

            if (current.right != null) {
                queue.offer(current.right);
            }
        }

    }

    public Node search(int value) {
        return this.searchImpl(this.root, value);
    }

    private Node searchImpl(Node node, int value) {
        if (node == null) {
            return null;
        }

        if (node.data == value) {
            return node;
        }

        if (node.data < value) {
            return searchImpl(node.right, value);
        } else {
            return searchImpl(node.left, value);
        }
    }

    public void delete(int value) {
        this.root = this.deleteImpl(this.root, value);
    }

    private Node deleteImpl(Node node, int value) {
        if (node == null) {
            return node;
        }
        
        if (node.data > value) {
            node.left = this.deleteImpl(node.left, value);
            return node;
        } else if (node.data < value) {
            node.right = this.deleteImpl(node.right, value);
            return node;
        }
        
        if (node.left == null) {
            Node temp = node.right;
            return temp;
        } else if (node.right == null) {
            Node temp = node.left;
            return temp;
        }
        else {

            Node succParent = node;

            Node succ = node.right;
            while (succ.left != null) {
                succParent = succ;
                succ = succ.left;
            }
            
            if (succParent != node) {
                succParent.left = succ.right;
            } else {
                succParent.right = succ.right;
            }

            node.data = succ.data;
            
            return node;
        }
    }

    public static void main(String[] args) {
        BST bst = new BST();

        bst.insert(10);
        bst.insert(5);
        bst.insert(7);
        bst.insert(3);
        bst.insert(16);
        bst.insert(12);
        bst.insert(20);

        bst.delete(5);
        bst.dfs();
    }
}

/*
import java.util.LinkedList;
import java.util.Queue;

class Student {
    int id;
    String fullName;
    int yearOfBirth;
    double average;

    public Student(int id, String fullName, int yearOfBirth, double average) {
        this.id = id;
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
        this.average = average;
    }
}

class Node {
    Student student;
    Node left;
    Node right;
    int height;

    public Node(Student student) {
        this.student = student;
        this.height = 1;
    }
}

class BST {
    private Node root;

    public BST() {
        root = null;
    }

    private int height(Node node) {
        if (node == null)
            return 0;
        return node.height;
    }

    private int getBalance(Node node) {
        if (node == null)
            return 0;
        return height(node.left) - height(node.right);
    }

    private Node rotateRight(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    private Node rotateLeft(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    public void insert(Student student) {
        root = insertNode(root, student);
    }

    private Node insertNode(Node node, Student student) {
        if (node == null)
            return new Node(student);

        if (student.id < node.student.id)
            node.left = insertNode(node.left, student);
        else if (student.id > node.student.id)
            node.right = insertNode(node.right, student);
        else
            return node; // Duplicate keys not allowed

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        if (balance > 1 && student.id < node.left.student.id)
            return rotateRight(node);

        if (balance < -1 && student.id > node.right.student.id)
            return rotateLeft(node);

        if (balance > 1 && student.id > node.left.student.id) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        if (balance < -1 && student.id < node.right.student.id) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    public void levelOrderTraversal() {
        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.println("ID: " + node.student.id + ", Name: " + node.student.fullName);

            if (node.left != null)
                queue.add(node.left);

            if (node.right != null)
                queue.add(node.right);
        }
    }

    public void traverseDescending() {
        traverseDescendingHelper(root);
    }

    private void traverseDescendingHelper(Node node) {
        if (node == null)
            return;

        traverseDescendingHelper(node.right);
        System.out.println("ID: " + node.student.id + ", Name: " + node.student.fullName);
        traverseDescendingHelper(node.left);
    }

    public int countStudentsWithAverageLessThanFive() {
        return countStudentsWithAverageLessThanFiveHelper(root);
    }

    private int countStudentsWithAverageLessThanFiveHelper(Node node) {
        if (node == null)
            return 0;

        int count = countStudentsWithAverageLessThanFiveHelper(node.left) +
                countStudentsWithAverageLessThanFiveHelper(node.right);

        if (node.student.average < 5)
            count++;

        return count;
    }

    public void deleteStudentsWithAgeNineteen() {
        root = deleteStudentsWithAgeNineteenHelper(root);
    }

    private Node deleteStudentsWithAgeNineteenHelper(Node node) {
        if (node == null)
            return null;

        node.left = deleteStudentsWithAgeNineteenHelper(node.left);
        node.right = deleteStudentsWithAgeNineteenHelper(node.right);

        if (node.student.yearOfBirth == 2003)
            return null;

        return node;
    }
}

public class student_code {
    public static void main(String[] args) {
        BST bst = new BST();

        // Insert at least 10 students
        bst.insert(new Student(1, "John Doe 1", 2000, 7.5));
        bst.insert(new Student(2, "John Doe 2", 1999, 6.8));
        bst.insert(new Student(3, "John Doe 3", 2001, 4.2));
        bst.insert(new Student(4, "John Doe 4", 1998, 8.9));
        bst.insert(new Student(5, "John Doe 5", 2002, 6.1));
        bst.insert(new Student(6, "John Doe 6", 2003, 9.2));
        bst.insert(new Student(7, "John Doe 7", 2001, 3.5));
        bst.insert(new Student(8, "John Doe 8", 2002, 7.7));
        bst.insert(new Student(9, "John Doe 9", 2000, 5.9));
        bst.insert(new Student(10, "John Doe 10", 2004, 6.3));

        // Invoke the functions
        System.out.println("Level Order Traversal:");
        bst.levelOrderTraversal();

        System.out.println("Descending Order Traversal:");
        bst.traverseDescending();

        int count = bst.countStudentsWithAverageLessThanFive();
        System.out.println("Number of students with average less than five: " + count);

        bst.deleteStudentsWithAgeNineteen();
        System.out.println("Students deleted whose age is 19.");
    }


}



Given Student.s information (id, fullname, yearOfBirth, average), id is the key. Let’s define 
the Student class and Binary Search Tree (BST) class that contains the student objects. Inside BST 
class you should implement functions as following requirements. Note: You can write additional 
functions for code convenience. Write a function that deletes students whose age is 19.
You

Write the code on 1 file, named the file using your student ID: student_code.java
(1 point) Given Student.s information (id, fullname, yearOfBirth, average), id is the key. Let’s define the Student class and Binary Search Tree (BST) class that contains the student objects. Inside BST class you should implement functions as following requirements. Note: You can write additional functions for code convenience.
(2 points) Write a function that insert a student to the AVL tree.
(1 point) Write a function to traverse the tree by Level Order Traversal using Queue. (Hint: Using the isEmpty, add, remove methods of the Queue in Java to write function of question 2).
(1 point) Write a function to traverse the tree in descending order.
(1 point) Write a function that counts how many students whose average mark is less than five.
(2 points) Write a function that deletes students whose age is 19.
(2 points) Write main() function to invoke the functions above (0.4 point for each function). Note: You should insert at least 10 students to the AVL tree
ChatGPT
ChatGPT


Sure! Here is the code for the student_code.java file:

java


import java.util.LinkedList;
import java.util.Queue;

class Student {
    int id;
    String fullName;
    int yearOfBirth;
    double average;

    public Student(int id, String fullName, int yearOfBirth, double average) {
        this.id = id;
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
        this.average = average;
    }
}

class Node {
    Student student;
    Node left;
    Node right;
    int height;

    public Node(Student student) {
        this.student = student;
        this.height = 1;
    }
}

class BST {
    private Node root;

    public BST() {
        root = null;
    }

    private int height(Node node) {
        if (node == null)
            return 0;
        return node.height;
    }

    private int getBalance(Node node) {
        if (node == null)
            return 0;
        return height(node.left) - height(node.right);
    }

    private Node rotateRight(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    private Node rotateLeft(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    public void insert(Student student) {
        root = insertNode(root, student);
    }

    private Node insertNode(Node node, Student student) {
        if (node == null)
            return new Node(student);

        if (student.id < node.student.id)
            node.left = insertNode(node.left, student);
        else if (student.id > node.student.id)
            node.right = insertNode(node.right, student);
        else
            return node; // Duplicate keys not allowed

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        if (balance > 1 && student.id < node.left.student.id)
            return rotateRight(node);

        if (balance < -1 && student.id > node.right.student.id)
            return rotateLeft(node);

        if (balance > 1 && student.id > node.left.student.id) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        if (balance < -1 && student.id < node.right.student.id) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    public void levelOrderTraversal() {
        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.println("ID: " + node.student.id + ", Name: " + node.student.fullName);

            if (node.left != null)
                queue.add(node.left);

            if (node.right != null)
                queue.add(node.right);
        }
    }

    public void traverseDescending() {
        traverseDescendingHelper(root);
    }

    private void traverseDescendingHelper(Node node) {
        if (node == null)
            return;

        traverseDescendingHelper(node.right);
        System.out.println("ID: " + node.student.id + ", Name: " + node.student.fullName);
        traverseDescendingHelper(node.left);
    }

    public int countStudentsWithAverageLessThanFive() {
        return countStudentsWithAverageLessThanFiveHelper(root);
    }

    private int countStudentsWithAverageLessThanFiveHelper(Node node) {
        if (node == null)
            return 0;

        int count = countStudentsWithAverageLessThanFiveHelper(node.left) +
                countStudentsWithAverageLessThanFiveHelper(node.right);

        if (node.student.average < 5)
            count++;

        return count;
    }

    public void deleteStudentsWithAgeNineteen() {
        root = deleteStudentsWithAgeNineteenHelper(root);
    }

    private Node deleteStudentsWithAgeNineteenHelper(Node node) {
        if (node == null)
            return null;

        node.left = deleteStudentsWithAgeNineteenHelper(node.left);
        node.right = deleteStudentsWithAgeNineteenHelper(node.right);

        if (node.student.yearOfBirth == 2003)
            return null;

        return node;
    }
}

public class student_code {
    public static void main(String[] args) {
        BST bst = new BST();

        // Insert at least 10 students
        bst.insert(new Student(1, "John Doe 1", 2000, 7.5));
        bst.insert(new Student(2, "John Doe 2", 1999, 6.8));
        bst.insert(new Student(3, "John Doe 3", 2001, 4.2));
        bst.insert(new Student(4, "John Doe 4", 1998, 8.9));
        bst.insert(new Student(5, "John Doe 5", 2002, 6.1));
        bst.insert(new Student(6, "John Doe 6", 2003, 9.2));
        bst.insert(new Student(7, "John Doe 7", 2001, 3.5));
        bst.insert(new Student(8, "John Doe 8", 2002, 7.7));
        bst.insert(new Student(9, "John Doe 9", 2000, 5.9));
        bst.insert(new Student(10, "John Doe 10", 2004, 6.3));

        // Invoke the functions
        System.out.println("Level Order Traversal:");
        bst.levelOrderTraversal();

        System.out.println("Descending Order Traversal:");
        bst.traverseDescending();

        int count = bst.countStudentsWithAverageLessThanFive();
        System.out.println("Number of students with average less than five: " + count);

        bst.deleteStudentsWithAgeNineteen();
        System.out.println("Students deleted whose age is 19.");
    }
}
This code defines a Student class and a Binary Search Tree (BST) class. The Student class represents a student with properties like id, fullName, yearOfBirth, and average. The BST class contains the implementation of various functions as per the given requirements.

Here's a breakdown of the code:

The Student class represents a student with properties like id, fullName, yearOfBirth, and average.

The Node class represents a node in the binary search tree. Each node contains a Student object, a left child node, a right child node, and the height of the node.

The BST class represents the binary search tree. It has private helper methods for height calculation, balance factor calculation, and rotation operations.

The insert method inserts a new student into the AVL tree while maintaining the AVL tree property.

The levelOrderTraversal method performs a level order traversal on the tree using a queue to print each student's id and name.

The traverseDescending method traverses the tree in descending order by recursively visiting the right subtree, printing the student's id and name, and then recursively visiting the left subtree.

The countStudentsWithAverageLessThanFive method counts the number of students whose average mark is less than five by recursively traversing the tree and incrementing the count when the average is less than five.

The deleteStudentsWithAgeNineteen method deletes students from the tree whose year of birth is 2003 (age is 19) by recursively traversing the tree and returning null for the corresponding nodes.

The main function creates an instance of the BST class, inserts at least 10 students into the AVL tree, and invokes the functions as required.

Note: Make sure to save the file as "student_code.java" and compile and run it using a Java compiler.

You

Given Student.s information (id, fullname, yearOfBirth, average), id is the key. Let’s define the Student class and Binary Search Tree (BST) class that contains the student objects. Inside BST class you should implement functions as following requirements. Note: You can write additional functions for code convenience. Write a function that deletes students whose age is 19.

ChatGPT
ChatGPT

To delete students from the Binary Search Tree (BST) whose age is 19, we can use the following steps:

Define the Student class: The Student class should have the attributes id, fullname, yearOfBirth, and average.
java

class Student {
    int id;
    String fullname;
    int yearOfBirth;
    double average;
    // Constructor and other methods
}
Implement the Binary Search Tree (BST) class: The BST class should have a Node class and methods for insertion, deletion, searching, and deletion of students whose age is 19.
java

class BST {
    class Node {
        Student student;
        Node left;
        Node right;
        
        Node(Student student) {
            this.student = student;
            this.left = null;
            this.right = null;
        }
    }
    
    Node root;
    
    BST() {
        root = null;
    }
    
    // Implement other methods for insertion, searching, etc.
    
    // Function to delete students whose age is 19
    void deleteStudentsWithAge19(Node node) {
        if (node == null) {
            return;
        }
        
        deleteStudentsWithAge19(node.left);  // Recursively delete from left subtree
        deleteStudentsWithAge19(node.right);  // Recursively delete from right subtree
        
        if (node.student.yearOfBirth == 2002) {  // Assuming the current year is 2021
            deleteNode(node.student.id);  // Delete the node from the BST
        }
    }
    
    // Function to delete a specific node from the BST
    void deleteNode(int id) {
        root = deleteNodeHelper(root, id);
    }
    
    // Helper function to delete a node from the BST
    Node deleteNodeHelper(Node root, int id) {
        if (root == null) {
            return null;
        }
        
        if (id < root.student.id) {
            root.left = deleteNodeHelper(root.left, id);
        } else if (id > root.student.id) {
            root.right = deleteNodeHelper(root.right, id);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            
            // If the node has two children, find the inorder successor (smallest node in the right subtree)
            Node minNode = findMinNode(root.right);
            root.student = minNode.student;
            root.right = deleteNodeHelper(root.right, minNode.student.id);
        }
        
        return root;
    }
    
    // Helper function to find the minimum node in a subtree
    Node findMinNode(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        
        return node;
    }
}

public static void main(String[] args) {
    BST bst = new BST();
    
    // Insert some students into the BST
    
    // Delete students whose age is 19
    bst.deleteStudentsWithAge19(bst.root);
    
    // Print the updated BST
    // ...
}



*/
