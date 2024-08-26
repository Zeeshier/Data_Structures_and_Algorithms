public class LinearSearchRecursion {
        public static void main(String[] args) {
            System.out.println("Linear Search with Recursion");
    
            int[] arr = {2, 4, 6, 8, 10}; 
            int key = 8; // Value to search for
    
            int index = linearSearch(arr, key, 0);
    
            if (index != -1) {
                System.out.println("Element found at index: " + index);
            } else {
                System.out.println("Element not found in the array.");
            }
        }
    
        public static int linearSearch(int[] array, int key, int index) {
            // Base case: if the index goes out of bounds, return -1
            if (index >= array.length) {
                return -1;
            }
    
            // If the current element matches the key, return the index
            if (array[index] == key) {
                return index;
            }
    
            // Recursive call to search in the rest of the array
            return linearSearch(array, key, index + 1);
        }
    }
