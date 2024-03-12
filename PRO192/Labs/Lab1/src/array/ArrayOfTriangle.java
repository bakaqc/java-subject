package array;

import shape.Triangle;

public class ArrayOfTriangle {

    private Triangle[] a;
    private int n;

    public ArrayOfTriangle() {
        this.a = new Triangle[10];
        this.n = 0;
    }

    public ArrayOfTriangle(int capacity) {
        this.a = new Triangle[capacity];
        this.n = 0;
    }

    public Triangle get(int index) {
        if (index < 0 || index >= n) {
            System.out.println("Invalid index! \n");
            return null;
        }
        return a[index];
    }

    public Triangle set(int index, Triangle e) {
        if (index < 0 || index >= n) {
            System.out.println("Invalid index");
            System.exit(0);
        }
        Triangle temp = a[index];
        a[index] = e;
        return temp;
    }

    public void add(Triangle x) {
        if (n == a.length) {
            Triangle b[] = new Triangle[a.length * 2];
            System.arraycopy(a, 0, b, 0, a.length);
            a = b;
        }

        a[n++] = x;
    }

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

    public void add(Triangle x, int index) {
        if (n == a.length) {
            Triangle[] b = new Triangle[a.length * 2];
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

    public Triangle remove(int index) {
        if (n <= 0) {
            System.out.println("List underflow");
            System.exit(0);
        }
        if (index < 0 || index >= n) {
            System.out.println("Invalid index: " + index);
            System.exit(0);
        }
        Triangle temp = a[index];
        for (int i = index; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
        a[--n] = null;
        return temp;
    }

    public boolean contains(Triangle x) {
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

    public int indexOf(Triangle x) {
        for (int i = 0; i < this.n; i++) {
            if (this.a[i].equals(x)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Triangle x) {
        for (int i = this.n - 1; i >= 0; i--) {
            if (this.a[i].equals(x)) {
                return i;
            }
        }
        return -1;
    }

    public static void input(ArrayOfTriangle arr) {
        arr.add(new Triangle(7, 8, 9));
        arr.add(new Triangle(7465, 45, 123));
        arr.add(new Triangle(31, 78, 123));
        arr.add(new Triangle(72, 85, 123));
    }

    public static double maxArea(ArrayOfTriangle arr) {
        double max = arr.get(0).area();

        for (int i = 1; i < arr.size(); i++) {
            if (max < arr.get(i).area()) {
                max = arr.get(i).area();
            }
        }

        return max;
    }

    public static void main(String[] args) {
        ArrayOfTriangle arr = new ArrayOfTriangle();
        input(arr);
    }
}
