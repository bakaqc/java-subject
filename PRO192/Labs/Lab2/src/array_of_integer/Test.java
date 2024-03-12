package array_of_integer;

public class Test {

    //Hàm kiểm tra số nguyên tố
    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Hàm tính tổng
    public static int sum(ArrayOfInteger arr) {
        int s = 0;
        for (int i = 0; i < arr.size(); i++) {
            s = s + arr.get(i);
        }
        //       System.out.println(s);
        return s;
    }

    //Hàm tính tích acsc phần tử chẵn
    public static int mulEven(ArrayOfInteger arr) {
        int d = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
                d *= arr.get(i);
            }
        }
        return d;
    }

    //Hàm xóa phần tử âm
    public static void remove(ArrayOfInteger arr) {
        for (int i = 0; i < arr.size();) {
            if (arr.get(i) < 0) {
                arr.remove(i);
            } else {
                i++;
            }
        }
        System.out.println(arr);
    }

    //Hàm đếm các phần tử lẻ có index chẵn
    public static int oddElements(ArrayOfInteger arr) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 != 0 && i % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    //Hàm tính trung bình cộng các số nguyên tố
    public static double avrprime(ArrayOfInteger arr) {
        double s = 0;
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (isPrimeNumber(arr.get(i)) == true) {
                s += arr.get(i);
                count++;
            }
        }
        return s / count;
    }

    //Hàm tìm tổng lớn nhất của 2 phần tử liên tiếp
    public static int largestSumOfTwoElement(ArrayOfInteger arr) {
        int max = arr.get(0) + arr.get(1);
        for (int i = 2; i < arr.size() - 1; i++) {
            if (max < arr.get(i) + arr.get(i + 1)) {
                max = arr.get(i) + arr.get(i + 1);
            }
        }
        return max;

    }

    public static void main(String[] args) {

        ArrayOfInteger b = new ArrayOfInteger();
        b.input();
        System.out.println(b);
        System.out.println(sum(b));
        remove(b);
        System.out.println(mulEven(b));
        System.out.println(oddElements(b));
        System.out.println(avrprime(b));
        System.out.println(largestSumOfTwoElement(b));

    }
}
