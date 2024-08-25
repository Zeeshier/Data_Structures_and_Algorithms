public class InsertionSort {
        public static void main(String[] args) {
            System.out.println("Insertion Sort");
            int arr[] = {58, 36, 84, 18, 62}; 
    
            // Insertion Sort
            for (int i = 1; i < arr.length; i++) {
                int curr = arr[i];
                int prev = i - 1;
    
                // Finding out the correct position to insert
                while (prev >= 0 && arr[prev] > curr) {
                    arr[prev + 1] = arr[prev];
                    prev--;
                }
    
                // Insertion
                arr[prev + 1] = curr;
            }
    
            System.out.println("Sorted Array:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    
    
