package array_of_double;

import java.util.Scanner;
import shape.Rectangle;

public class ArrayOfRectangle {

    protected Rectangle[] a;
    protected int n;

    //hàm khởi tạo ko đối số
    public ArrayOfRectangle() {
        this.a = new Rectangle[10];
        this.n = 0;
    }

    //hàm khởi tạo có đối số
    public ArrayOfRectangle(int capacity) {
        this.a = new Rectangle[capacity];
        this.n = 0;
    }

    //Hàm get, set
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

    //Cài đặt phương thức
    public void add(Rectangle x) {
        //trường hợp mảng đã đầy>biến thành mảng chưa đây
        if (n == a.length) //cập nhận mảng mới
        {
            Rectangle b[] = new Rectangle[a.length * 2];
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
    void add(Rectangle x, int index) {
        if (n == a.length) {
            Rectangle[] b = new Rectangle[a.length * 2];
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

    public int size() {
        return this.n;
    }

    //check phần tử x có trong dãy ?
    public boolean contains(Rectangle x) {
        for (int i = 0; i < this.n; i++) {
            if (this.a[i] == x) {
                return true;
            }
        }
        return false;
    }

    // trả về vị trí dầu tiên xuất hiện trong mảng của giá trị x
    int indexOf(Rectangle x) {
        for (int i = 0; i < this.n; i++) {
            if (this.a[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // trả về vị trí cuối cùng xuất hiện trong mảng của x
    int lastIndexOf(Rectangle x) {
        for (int i = this.n - 1; i >= 0; i--) {
            if (this.a[i] == x) {
                return i;
            }
        }
        return -1;
    }

    //Hàm input, output
    public void input(ArrayOfRectangle a) {
        a.add(new Rectangle(5, 10), 1);
        a.add(new Rectangle(6, 11), 2);
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
