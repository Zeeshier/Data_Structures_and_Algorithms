public class SelectionSort {
        public static void main(String[] args) {
            System.out.println("Selection Sort");
            int arr[] = {5, 3, 4, 1, 2};
    
            // Selection Sort
            for (int i = 0; i < arr.length - 1; i++) {
                int min = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[min] > arr[j]) {
                        min = j;
                    }
                }
    
                // Swap
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
    
            System.out.println("Sorted Array:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    
    
