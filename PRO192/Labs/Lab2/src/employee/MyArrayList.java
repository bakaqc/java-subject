package employee;

import array_of_double.*;

public class MyArrayList<T> {

    private T[] a;
    private int n;

    //Hàm khởi tạo k đối số
    public MyArrayList() {
        this.a = (T[]) new Object[10];
        this.n = 0;
    }

    //Hàm khởi tạo có đối số
    public MyArrayList(int capacity) {
        this.a = (T[]) new Object[capacity];
        this.n = 0;
    }

    //Hàm get,set
    public T get(int index) {
        if (index < 0 || index >= n) {
            System.out.println("Invalid index! \n");
            return null;
        }
        return a[index];
    }

    public T set(int index, T e) {
        if (index < 0 || index >= n) {
            System.out.println("Invalid index");
            System.exit(0);
        }
        T temp = a[index];
        a[index] = e;
        return temp;
    }

    //Cài đặt phương thức
    public void add(T x) {
        if (n == a.length) {
            T b[] = (T[]) new Object[a.length * 2];
            System.arraycopy(a, 0, b, 0, a.length);
            a = b;
        }

        a[n++] = x;
    }

    public void add(T x, int index) {
        if (n == a.length) {
            T[] b = (T[]) new Object[a.length * 2];
            System.arraycopy(b, 0, a, 0, a.length);
            a = b;
        }
        if (index < 0 || index > n) {
            System.out.println("Invalid index! \n");
            return;
        }
        for (int i = n; i > index; i--) {
            a[i] = a[i - 1];
        }
        a[index] = x;
        n++;
    }

    public T remove(int index) {
        if (n <= 0) {
            System.out.println("List underflow");
            System.exit(0);
        }
        if (index < 0 || index >= n) {
            System.out.println("Invalid index: " + index);
            System.exit(0);
        }
        T temp = a[index];
        for (int i = index; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
        a[--n] = null;
        return temp;
    }

    public boolean contains(T x) {
        for (int i = 0; i < this.n; i++) {
            if (this.a[i].equals(x)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return this.n;
    }

    public int indexOf(T x) {
        for (int i = 0; i < this.n; i++) {
            if (this.a[i].equals(x)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T x) {
        for (int i = this.n - 1; i >= 0; i--) {
            if (this.a[i].equals(x)) {
                return i;
            }
        }
        return -1;
    }

    //Hàm toString
    @Override
    public String toString() {
        String result = "[";

        for (int i = 0; i < this.n; i++) {
            result += this.a[i];
            if (i != this.n - 1) {
                result += ", ";
            }
        }

        result += "]";

        return result;
    }

}
