/*
Bài 1: Tạo 1 mảng bất kì:
    Hiển thị ra số lớn thứ 3 trong mảng.
    Hiển thị ra tổng các số lẻ trong mảng.
    Hiển thị ra trung bình các số chẵn trong mảng.
 */
package xulivonglap;

import java.util.Arrays;

public class Xulivonglap1 {

//     Hiển thị ra số lớn thứ 3 trong mảng.
    private static void max3rd(int[] arr) {
        Arrays.sort(arr);
        System.out.println("The 3rd largest number in the array: " + arr[arr.length - 3]);
    }

//     Hiển thị ra tổng các số lẻ trong mảng.
    private static void sumofevennumbers(int[] arr) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                s += arr[i];
            }
        }
        System.out.println("The sum of the odd numbers in the array: " + s);
    }

//    Hiển thị ra trung bình các số chẵn trong mảng.
    private static void avgofoddnumbers(int[] arr) {
        int s = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                s += arr[i];
                count++;
            }
        }
        System.out.println("The average of even numbers in the array: " + (float) s / count);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        max3rd(arr);
        sumofevennumbers(arr);
        avgofoddnumbers(arr);

    }
}
