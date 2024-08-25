public class BubbleSort {
    public static void main(String[] args){
            System.out.println("Bubble Sort ");
            int arr[] = {94,65,23,4,82};

            // Bubble Sort
            for(int i=0; i<arr.length-1; i++){
                for(int j=0; j<arr.length-1-i; j++){
                    if(arr[j]> arr[j+1]){

                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }

            // print array
            System.out.println("Sorted Array:");
            for(int i=0;i<5;i++){
                System.out.print(arr[i]+ " ");
            }
        }
    }
