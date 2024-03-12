package test_PE;

public class Node {

    public Student student;
    public Node left;
    public Node right;

    public Node(Student student) {
        this.student = student;
        this.left = null;
        this.right = null;
    }

    public Node(Student student, Node left, Node right) {
        this.student = student;
        this.left = left;
        this.right = right;
    }

    public Student getStudent() {
        return student;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

}
