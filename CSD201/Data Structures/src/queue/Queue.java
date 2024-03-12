package queue;

public interface Queue {

    public void clear();

    public boolean isEmpty();

    public void enqueue(int value);

    public int dequeue();

    public int front();
}
