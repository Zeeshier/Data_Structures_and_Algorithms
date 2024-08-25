public class LinearSearch {
    public static void main(String[] args) {
        System.out.println("Linear Search");
        int arr[] = {1, 2, 3, 4, 5};
        int target = 3;

        // Linear Search
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index: " + i);
                return;
            }
        }

        System.out.println("Element not found");
    }
}
