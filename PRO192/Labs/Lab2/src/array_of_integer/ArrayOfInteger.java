package array_of_integer;

import java.util.Scanner;

public class ArrayOfInteger {

    protected int[] arr;
    protected int n;

    //hàm khởi tạo ko đối số
    public ArrayOfInteger() {
        this.arr = new int[10];
        this.n = 0;
    }

    //hàm khởi tạo có đối số
    public ArrayOfInteger(int capacity) {
        this.arr = new int[capacity];
        this.n = 0;
    }

    //Hàm get, set
    public Integer get(int index) {
        if (index < 0 || index >= n) {
            System.out.println("Invalid index! \n");
            return null;
        }
        return arr[index];
    }

    public int set(int index, int e) {
        if (index < 0 || index >= n) {
            System.out.println("Invalid index");
            System.exit(0);
        }
        int temp = arr[index];
        arr[index] = e;
        return temp;
    }

    //Cài đặt phương thức
    public void add(int x) {
        //trường hợp mảng đã đầy>biến thành mảng chưa đây
        if (n == arr.length) //cập nhận mảng mới
        {
            int b[] = new int[arr.length * 2];
            //di chuyển các ptu mang arr sang mang b
            for (int i = 0; i < arr.length; i++) {
                b[i] = arr[i];
            }
            //gán địa chỉ của b sang arr, vì ra khỏi hàm b biến mất
            arr = b;
        }
        //chèn x vào cuối mảng của dãy
        arr[n++] = x;
    }

    //chèn x vào vị trí index
    void add(int x, int index) {
        if (n == arr.length) {
            int[] b = new int[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = b[i];
            }
            arr = b;
        }
        if (index < 0 || index > n) {
            System.out.println("Invalid index! \n");
            return;
        }
        for (int i = n; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = x;
        n++;
    }

//    public void sum() {
//        int s = 0;
//        for (int i = 0; i < arr.length; i++) {
//            s += arr[i];
//        }
//
//        System.out.println(s);
//    }
    //xoá số ở vị trí index
//    public void remove(int index) 
//    {
//        int[] b = new int[n - 1];
//        for (int i = 0; i < index; i++) 
//        {
//            b[i] = this.arr[i];
//        }
//        for (int i = index + 1; i < this.n; i++) 
//        {
//            b[i - 1] = this.arr[i];
//        }
//        this.arr = b;
//        this.n--;
//    }
    public int remove(int index) {
        if (n <= 0) {
            System.out.println("List underflow");
            System.exit(0);
        }
        if (index < 0 || index >= n) {
            System.out.println("Invalid index: " + index);
            System.exit(0);
        }
        int temp = arr[index];
        for (int i = index; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--n] = 0;
        return temp;
    }

    public int size() {
        return this.n;
    }

    //check phần tử x có trong dãy ?
    public boolean contains(int x) {
        for (int i = 0; i < this.n; i++) {
            if (this.arr[i] == x) {
                return true;
            }
        }
        return false;
    }

    // trả về vị trí dầu tiên xuất hiện trong mảng của giá trị x
    int indexOf(int x) {
        for (int i = 0; i < this.n; i++) {
            if (this.arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // trả về vị trí cuối cùng xuất hiện trong mảng của x
    int lastIndexOf(int x) {
        for (int i = this.n - 1; i >= 0; i--) {
            if (this.arr[i] == x) {
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
            this.arr[i] = sc.nextInt();
        }
    }

    public void output() {
        int i;
        System.out.println("Mang vua nhap la: ");
        for (i = 0; i < n; i++) {
            System.out.println(this.arr[i]);
        }
    }

    //Hàm toString
    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < this.n; i++) {
            result += this.arr[i];
            if (i != this.n - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }

}
