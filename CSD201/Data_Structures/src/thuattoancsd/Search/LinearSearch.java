package thuattoancsd.Search;

public class LinearSearch {

    public static int linearSearch(int[] arr, int key) {
        // Iterate through each element of the array
        for (int i = 0; i < arr.length; i++) {
            // If the current element is equal to the key, return its index
            if (arr[i] == key) {
                return i;
            }
        }
        // If the key is not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 10, 5, 4};
        int key = 5;

        int result = linearSearch(arr, key);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
