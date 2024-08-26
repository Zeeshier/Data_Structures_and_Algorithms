public class BubblesortRecursion {
        public static void main(String[] args) {
            System.out.println("Bubble Sort with Recursion");
    
            int[] arr = {54, 34, 49, 1, 23};
    
            // Perform Bubble Sort
            bubbleSort(arr, arr.length);
    

            System.out.println("Sorted Array:");
            for (int value : arr) {
                System.out.print(value + " ");
            }
        }
    
        // Bubble Sort using recursion without loop
        public static void bubbleSort(int[] arr, int n) {
            // Base case
            if (n == 1) {
                return;
            }
    
            // Move the largest element to the end of the array
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // Swap arr[i] and arr[i+1]
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
    
            // Recursively sort the rest of the array
            bubbleSort(arr, n - 1);
        }
    }
 