package queue;

public class LinkedListQueue implements Queue {

    private Node head;

    public LinkedListQueue() {
        this.head = null;
    }

    @Override
    public void clear() {
        this.head = null;
    }

    @Override
    public boolean isEmpty() {
        return this.head == null;
    }

    @Override
    public void enqueue(int value) {
        if (this.head == null) {
            this.head = new Node(value);
        } else {

            Node current = this.head.next;
            Node prev = this.head;

            while (current != null) {
                prev = current;
                current = current.next;
            }

            prev.next = new Node(value);
        }
    }

    @Override
    public int dequeue() {
        int front = this.head.data;
        this.head = this.head.next;

        return front;
    }

    @Override
    public int front() {
        return this.head.data;
    }

    public static void main(String[] args) {
        LinkedListQueue q = new LinkedListQueue();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
