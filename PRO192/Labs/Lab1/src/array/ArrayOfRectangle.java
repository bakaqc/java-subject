package array;

import shape.Rectangle;

public class ArrayOfRectangle {

    private Rectangle[] a;
    private int n;

    public ArrayOfRectangle() {
        this.a = new Rectangle[10];
        this.n = 0;
    }

    public ArrayOfRectangle(int capacity) {
        this.a = new Rectangle[capacity];
        this.n = 0;
    }

    public Rectangle get(int index) {
        if (index < 0 || index >= n) {
            System.out.println("Invalid index! \n");
            return null;
        }
        return a[index];
    }

    public Rectangle set(int index, Rectangle e) {
        if (index < 0 || index >= n) {
            System.out.println("Invalid index");
            System.exit(0);
        }
        Rectangle temp = a[index];
        a[index] = e;
        return temp;
    }

    public void add(Rectangle x) {
        if (n == a.length) {
            Rectangle b[] = new Rectangle[a.length * 2];
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

    public void add(Rectangle x, int index) {
        if (n == a.length) {
            Rectangle[] b = new Rectangle[a.length * 2];
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

    public Rectangle remove(int index) {
        if (n <= 0) {
            System.out.println("List underflow");
            System.exit(0);
        }
        if (index < 0 || index >= n) {
            System.out.println("Invalid index: " + index);
            System.exit(0);
        }
        Rectangle temp = a[index];
        for (int i = index; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
        a[--n] = null;
        return temp;
    }

    public boolean contains(Rectangle x) {
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

    public int indexOf(Rectangle x) {
        for (int i = 0; i < this.n; i++) {
            if (this.a[i].equals(x)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Rectangle x) {
        for (int i = this.n - 1; i >= 0; i--) {
            if (this.a[i].equals(x)) {
                return i;
            }
        }
        return -1;
    }

    public static void input(ArrayOfRectangle arr) {
        arr.add(new Rectangle(7, 8));
        arr.add(new Rectangle(7465, 45));
        arr.add(new Rectangle(31, 78));
        arr.add(new Rectangle(72, 85));
    }

    public static double maxArea(ArrayOfRectangle arr) {
        double max = arr.get(0).area();

        for (int i = 1; i < arr.size(); i++) {
            if (max < arr.get(i).area()) {
                max = arr.get(i).area();
            }
        }

        return max;
    }

    public static void main(String[] args) {
        ArrayOfRectangle arr = new ArrayOfRectangle();
        input(arr);

        System.out.println(arr);

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(1);
    }
}
