package thuattoancsd.Sort;

//public class InsertionSort {
//
//    public static void insertionSort(int[] arr) {
//        int n = arr.length;
//
//        for (int i = 1; i < n; i++) {
//            int key = arr[i]; // Phần tử được chèn vào phần đã sắp xếp
//            int j = i - 1;
//
//            // Di chuyển các phần tử của arr[0..i-1], lớn hơn key, lên một vị trí trước vị trí hiện tại của chúng
//            while (j >= 0 && arr[j] > key) {
//                arr[j + 1] = arr[j];
//                j--;
//            }
//
//            arr[j + 1] = key; // Chèn phần tử khóa vào đúng vị trí của nó trong phần đã sắp xếp
//        }
//    }
//    
//    public static void printArray(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {5, 2, 8, 12, 1};
//
//        System.out.println("Original Array:");
//        printArray(arr);
//
//        insertionSort(arr);
//
//        System.out.println("\nSorted Array:");
//        printArray(arr);
//    }
//}
