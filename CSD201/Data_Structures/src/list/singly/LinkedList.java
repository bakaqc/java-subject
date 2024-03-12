package list.singly;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void addFirst(int value) {
        Node node = new Node(value);

        if (this.isEmpty()) {
            this.head = this.tail = node;
        } else {
            node.next = head;
            head = node;
        }

        this.size++;
    }

    public void addLast(int value) {
        Node node = new Node(value);

        if (this.isEmpty()) {
            this.head = this.tail = node;
        } else {
            tail.next = node;
            tail = node;
        }

        this.size++;
    }

    public void traversal() {
        Node current = this.head;

        while (current != null) {
            System.out.print(current.data + " ");

            current = current.next;
        }

        System.out.println("");
    }

    public int size() {
        return this.size;
    }

    public Node get(int index) {
        Node node = this.head;
        int count = 0;

        while (node != null && count < index) {
            count++;
            node = node.next;
        }

        return node;
    }

    public Node search(int value) {
        Node node = this.head;

        while (node != null && node.data != value) {
            node = node.next;
        }

        return node;
    }

    public Node delete(int value) {
        Node node = this.head;
        Node prev = null;

        if (node != null && node.data == value) {
            head = node.next;
            this.size--;

            return node;
        }

        while (node != null && node.data != value) {
            prev = node;
            node = node.next;
        }

        if (node == null) {
            return null;
        }

        prev.next = node.next;
        this.size--;

        return node;
    }
}
