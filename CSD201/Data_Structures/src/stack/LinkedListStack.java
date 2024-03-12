package stack;

import java.util.EmptyStackException;

public class LinkedListStack implements Stack {

    private Node root;

    @Override
    public void clear() {
        this.root = null;
    }

    @Override
    public boolean isEmpty() {
        return this.root == null;
    }

    @Override
    public void push(int value) {
        if (this.root == null) {
            this.root = new Node(value);
        } else {
            Node current = this.root.next;
            Node prev = this.root;

            while (current != null) {
                prev = current;
                current = current.next;
            }

            prev.next = new Node(value);
        }
    }

    @Override
    public int pop() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        } else {
            Node current = this.root;
            Node prev = null;

            while (current.next != null) {
                prev = current;
                current = current.next;
            }

            if (prev != null) {
                prev.next = null;
            }
            else {
                this.root = null;
            }

            return current.data;
        }
    }

    @Override
    public int peek() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        } else {
            Node current = this.root.next;
            Node prev = this.root;

            while (current != null) {
                prev = current;
                current = current.next;
            }

            return prev.data;
        }
    }

    public static void main(String[] args) {
        LinkedListStack s = new LinkedListStack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }

}
