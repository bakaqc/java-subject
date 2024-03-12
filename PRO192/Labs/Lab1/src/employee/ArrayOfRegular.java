package employee;

public class ArrayOfRegular {

    private Regular[] a;
    private int n;

    public ArrayOfRegular() {
        this.a = new Regular[10];
        this.n = 0;
    }

    public ArrayOfRegular(int capacity) {
        this.a = new Regular[capacity];
        this.n = 0;
    }

    public Regular get(int index) {
        if (index < 0 || index >= n) {
            System.out.println("Invalid index! \n");
            return null;
        }
        return a[index];
    }

    public Regular set(int index, Regular e) {
        if (index < 0 || index >= n) {
            System.out.println("Invalid index");
            System.exit(0);
        }
        Regular temp = a[index];
        a[index] = e;
        return temp;
    }

    public void add(Regular x) {
        if (n == a.length) {
            Regular b[] = new Regular[a.length * 2];
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

    public void add(Regular x, int index) {
        if (n == a.length) {
            Regular[] b = new Regular[a.length * 2];
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

    public Regular remove(int index) {
        if (n <= 0) {
            System.out.println("List underflow");
            System.exit(0);
        }
        if (index < 0 || index >= n) {
            System.out.println("Invalid index: " + index);
            System.exit(0);
        }
        Regular temp = a[index];
        for (int i = index; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
        a[--n] = null;
        return temp;
    }

    public boolean contains(Regular x) {
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

    public int indexOf(Regular x) {
        for (int i = 0; i < this.n; i++) {
            if (this.a[i].equals(x)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Regular x) {
        for (int i = this.n - 1; i >= 0; i--) {
            if (this.a[i].equals(x)) {
                return i;
            }
        }
        return -1;
    }

    public static void input(ArrayOfRegular arr) {
        arr.add(new Regular());
        arr.add(new Regular());
        arr.add(new Regular());
        arr.add(new Regular());
    }
}