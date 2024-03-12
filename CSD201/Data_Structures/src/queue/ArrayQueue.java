package queue;

public class ArrayQueue implements Queue {

    private int arr[];
    private int size;

    public ArrayQueue() {
        this.arr = new int[100];
        this.size = 0;
    }

    @Override
    public void clear() {
        this.size = 0;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public void enqueue(int value) {
        if (this.size < 100) {
            this.arr[this.size++] = value;
        }
    }

    @Override
    public int dequeue() {
        int front = this.arr[0];

        for (int i = 1; i < this.size; i++) {
            this.arr[i - 1] = this.arr[i];
        }

        this.size--;

        return front;
    }

    @Override
    public int front() {
        return this.arr[0];
    }
    
    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue();
        
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
