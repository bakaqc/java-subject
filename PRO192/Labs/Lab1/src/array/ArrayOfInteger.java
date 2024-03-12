package array;

public class ArrayOfInteger {

    private int[] a;
    private int n;

    public ArrayOfInteger() {
        this.a = new int[10];
        this.n = 0;
    }

    public ArrayOfInteger(int capacity) {
        this.a = new int[capacity];
        this.n = 0;
    }

    public Integer get(int index) {
        if (index < 0 || index >= n) {
            System.out.println("Invalid index! \n");
            return null;
        }
        return a[index];
    }

    public int set(int index, int e) {
        if (index < 0 || index >= n) {
            System.out.println("Invalid index");
            System.exit(0);
        }
        int temp = a[index];
        a[index] = e;
        return temp;
    }

    public void add(int x) {
        //trường hợp mảng đã đầy>biến thành mảng chưa đây
        if (n == a.length) //cập nhận mảng mới
        {
            int b[] = new int[a.length * 2];
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

    public void add(int x, int index) {
        if (n == a.length) {
            int[] b = new int[a.length * 2];
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

    public int remove(int index) {
        if (n <= 0) {
            System.out.println("List underflow");
            System.exit(0);
        }
        if (index < 0 || index >= n) {
            System.out.println("Invalid index: " + index);
            System.exit(0);
        }
        int temp = a[index];
        for (int i = index; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
        a[--n] = 0;
        return temp;
    }

    public boolean contains(int x) {
        for (int i = 0; i < this.n; i++) {
            if (this.a[i] == x) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return this.n;
    }

    public int indexOf(int x) {
        for (int i = 0; i < this.n; i++) {
            if (this.a[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(int x) {
        for (int i = this.n - 1; i >= 0; i--) {
            if (this.a[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void removeNegative(ArrayOfInteger arr) {
        for (int i = 0; i < arr.size();) {
            if (arr.get(i) < 0) {
                arr.remove(i);
            } else {
                i++;
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void input(ArrayOfInteger arr) {
        arr.add(7);
        arr.add(2);
        arr.add(11);
        arr.add(16);
        arr.add(2);
    }

    public static int countPrime(ArrayOfInteger arr) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (isPrime(arr.get(i))) {
                count++;
            }
        }

        return count;
    }

    public static int sum(ArrayOfInteger arr) {
        int sum = 0;

        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }

        return sum;
    }

    public static int sumEven(ArrayOfInteger arr) {
        int sum = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
                sum += arr.get(i);
            }
        }

        return sum;
    }

    public static int countOdd(ArrayOfInteger arr) {
        int count = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 1) {
                count++;
            }
        }

        return count;
    }

    public static double averagePrime(ArrayOfInteger arr) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (isPrime(arr.get(i))) {
                sum += arr.get(i);
                count++;
            }
        }

        return (double) sum / count;
    }

    public static void main(String[] args) {

        ArrayOfInteger arr = new ArrayOfInteger();
        input(arr);

        System.out.println(arr);

        System.out.println(sum(arr));
    }
}
