package array_of_double;

import java.util.Scanner;

public class ArrayOfDouble {

    protected double[] a;
    protected int n;

    //hàm khởi tạo ko đối số
    public ArrayOfDouble() {
        this.a = new double[10];
        this.n = 0;
    }

    //hàm khởi tạo có đối số
    public ArrayOfDouble(int capacity) {
        this.a = new double[capacity];
        this.n = 0;
    }

    //Hàm get, set
    public Double get(int index) {
        if (index < 0 || index >= n) {
            System.out.println("Invalid index! \n");
            return null;
        }
        return a[index];
    }

    public double set(int index, int e) {
        if (index < 0 || index >= n) {
            System.out.println("Invalid index");
            System.exit(0);
        }
        double temp = a[index];
        a[index] = e;
        return temp;
    }

    //Cài đặt phương thức
    public void add(int x) {
        //trường hợp mảng đã đầy>biến thành mảng chưa đây
        if (n == a.length) //cập nhận mảng mới
        {
            double b[] = new double[a.length * 2];
            //di chuyển các ptu mang a sang mang b
            for (int i = 0; i < a.length; i++) {
                b[i] = a[i];
            }
            //gán địa chỉ của b sang a, vì ra khỏi hàm b biến mất
            a = b;
        }
        //chèn x vào cuối mảng của dãy
        a[n++] = x;
    }

    //chèn x vào vị trí index
    void add(int x, int index) {
        if (n == a.length) {
            double[] b = new double[a.length * 2];
            for (int i = 0; i < a.length; i++) {
                a[i] = b[i];
            }
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

    //xoá số ở vị trí index
//    public void remove(int index) 
//    {
//        int[] b = new int[n - 1];
//        for (int i = 0; i < index; i++) 
//        {
//            b[i] = this.a[i];
//        }
//        for (int i = index + 1; i < this.n; i++) 
//        {
//            b[i - 1] = this.a[i];
//        }
//        this.a = b;
//        this.n--;
//    }
    public double remove(int index) {
        if (n <= 0) {
            System.out.println("List underflow");
            System.exit(0);
        }
        if (index < 0 || index >= n) {
            System.out.println("Invalid index: " + index);
            System.exit(0);
        }
        double temp = a[index];
        for (int i = index; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
        a[--n] = 0;
        return temp;
    }

    public int size() {
        return this.n;
    }

    //check phần tử x có trong dãy ?
    public boolean contains(int x) {
        for (int i = 0; i < this.n; i++) {
            if (this.a[i] == x) {
                return true;
            }
        }
        return false;
    }

    // trả về vị trí dầu tiên xuất hiện trong mảng của giá trị x
    int indexOf(int x) {
        for (int i = 0; i < this.n; i++) {
            if (this.a[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // trả về vị trí cuối cùng xuất hiện trong mảng của x
    int lastIndexOf(int x) {
        for (int i = this.n - 1; i >= 0; i--) {
            if (this.a[i] == x) {
                return i;
            }
        }
        return -1;
    }

    //Hàm input, output
    public void input() {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println(" So phan tu cua mang: ");
        this.n = sc.nextInt();
        for (i = 0; i < n; i++) {
            System.out.println("a[" + i + "]= ");
            this.a[i] = sc.nextInt();
        }
    }

    public void output() {
        int i;
        System.out.println("Mang vua nhap la: ");
        for (i = 0; i < n; i++) {
            System.out.println(this.a[i]);
        }
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
