package array;

import shape.Circle;

public class ArrayOfCircle {

    private Circle[] a;
    private int n;

    public ArrayOfCircle() {
        this.a = new Circle[10];
        this.n = 0;
    }

    public ArrayOfCircle(int capacity) {
        this.a = new Circle[capacity];
        this.n = 0;
    }

    public Circle get(int index) {
        if (index < 0 || index >= n) {
            System.out.println("Invalid index! \n");
            return null;
        }
        return a[index];
    }

    public Circle set(int index, Circle e) {
        if (index < 0 || index >= n) {
            System.out.println("Invalid index");
            System.exit(0);
        }
        Circle temp = a[index];
        a[index] = e;
        return temp;
    }

    public void add(Circle x) {
        //trường hợp mảng đã đầy>biến thành mảng chưa đây
        if (n == a.length) //cập nhận mảng mới
        {
            Circle b[] = new Circle[a.length * 2];
            //di chuyển các ptu mang a sang mang b
            System.arraycopy(a, 0, b, 0, a.length);
            //gán địa chỉ của b sang a, vì ra khỏi hàm b biến mất
            a = b;
        }
        //chèn x vào cuối mảng của dãy
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

    public void add(Circle x, int index) {
        if (n == a.length) {
            Circle[] b = new Circle[a.length * 2];
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

    public Circle remove(int index) {
        if (n <= 0) {
            System.out.println("List underflow");
            System.exit(0);
        }
        if (index < 0 || index >= n) {
            System.out.println("Invalid index: " + index);
            System.exit(0);
        }
        Circle temp = a[index];
        for (int i = index; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
        a[--n] = null;
        return temp;
    }

    public boolean contains(Circle x) {
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

    public int indexOf(Circle x) {
        for (int i = 0; i < this.n; i++) {
            if (this.a[i].equals(x)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Circle x) {
        for (int i = this.n - 1; i >= 0; i--) {
            if (this.a[i].equals(x)) {
                return i;
            }
        }
        return -1;
    }

    public static void input(ArrayOfCircle arr) {
        arr.add(new Circle(7));
        arr.add(new Circle(7465));
        arr.add(new Circle(31));
        arr.add(new Circle(72));
    }

    public static void main(String[] args) {
        ArrayOfCircle arr = new ArrayOfCircle();
        input(arr);

        System.out.println(arr);
    }
}
