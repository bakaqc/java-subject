package thuattoancsd.Sort;
import java.util.Arrays;

public class RadixSort {
    public static void radixSort(int[] arr) {
        // Find the maximum number to determine the number of digits
        int max = Arrays.stream(arr).max().getAsInt();

        // Perform counting sort for every digit
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }

    private static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        // Initialize count array
        Arrays.fill(count, 0);

        // Count the occurrences of each digit
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        // Calculate cumulative count
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // Copy the output array to the original array
        System.arraycopy(output, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        System.out.println("Original array: " + Arrays.toString(arr));

        radixSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
