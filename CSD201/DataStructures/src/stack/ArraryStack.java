package stack;

import java.util.*;

public class ArraryStack implements Stack {

    private int arr[];
    private int size;

    public ArraryStack() {
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
    public void push(int value) {
        if (size < 100) {
            this.arr[this.size++] = value;
        }
    }

    @Override
    public int pop() {
        if (this.size > 0) {
            int top = this.arr[this.size - 1];
            this.size--;
            return top;
        } else {
            throw new EmptyStackException();
        }
    }

    @Override
    public int peek() {
        if (this.size > 1) {
            return this.arr[this.size - 1];
        } else {
            throw new EmptyStackException();
        }
    }
    
    public static void main(String[] args) {
        ArraryStack s = new ArraryStack();
        
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.peek());
        System.out.println(s.peek());
        System.out.println(s.peek());
        System.out.println(s.peek());
    }
}
