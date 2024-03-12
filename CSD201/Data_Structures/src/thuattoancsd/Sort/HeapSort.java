package thuattoancsd.Sort;

public class HeapSort {
    
    public static void heapSort(int[] array) {
        int n = array.length;
        
        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }
        
        // Extract elements from the heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Swap root (max element) with the last element
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            
            // Heapify the reduced heap
            heapify(array, i, 0);
        }
    }
    
    public static void heapify(int[] array, int n, int i) {
        int largest = i;  // Initialize largest as root
        int left = 2 * i + 1;  // Left child
        int right = 2 * i + 2;  // Right child
        
        // If left child is larger than root
        if (left < n && array[left] > array[largest]) {
            largest = left;
        }
        
        // If right child is larger than largest so far
        if (right < n && array[right] > array[largest]) {
            largest = right;
        }
        
        // If largest is not root
        if (largest != i) {
            // Swap root with the largest element
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;
            
            // Recursively heapify the affected sub-tree
            heapify(array, n, largest);
        }
    }
    
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        
        System.out.println("Original Array:");
        printArray(array);
        
        heapSort(array);
        
        System.out.println("\nSorted Array:");
        printArray(array);
    }
    
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

