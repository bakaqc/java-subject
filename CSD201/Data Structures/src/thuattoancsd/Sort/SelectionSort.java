package thuattoancsd;

//public class SelectionSort {
//    //sắp xếp tăng dùng array 
//    public static void selectionSort(int[] arr) {
//        int n = arr.length;
//
//        for (int i = 0; i < n - 1; i++) {
//            int minIndex = i;
//
//            // Find the index of the minimum element in the unsorted part
//            for (int j = i + 1; j < n; j++) {
//                if (arr[j] < arr[minIndex]) {
//                    minIndex = j;
//                }
//            }
//
//            // Swap the minimum element with the first element of the unsorted part
//            int temp = arr[minIndex];
//            arr[minIndex] = arr[i];
//            arr[i] = temp;
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {15, 8, 10, 2, 5};
//
//        System.out.println("Original array:");
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//
//        selectionSort(arr);
//
//        System.out.println("\nSorted array:");
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//    }
//}
