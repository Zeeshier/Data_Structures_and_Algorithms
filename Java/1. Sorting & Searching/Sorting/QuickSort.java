public class QuickSort {

        public static void quicksort(int arr[],int si, int ei){
            // base case
            if(si>= ei){
                return;
            }
            // last element
            int pIdx = partition(arr,si,ei);
            quicksort(arr, si, pIdx-1); // left
            quicksort(arr, pIdx+1, ei); // right
        }
    
        public static int partition(int arr[], int si, int ei){
            int pivot = arr[ei];
            int i = si-1; // to make place for elements smaller than pivot
    
            for(int j=si; j<ei; j++){
                if(arr[j] <= pivot){
                    i++;
               
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
         int temp = pivot;
         arr[ei] = arr[i];
         arr[i] = temp;  // pivot = arr[i]
         return i;
    }
    
    public static void printArr(int arr[]){
        for(int i=0 ; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        quicksort(arr, 0, arr.length-1);
        printArr(arr);
    }   
    }