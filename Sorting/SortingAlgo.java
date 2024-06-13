public class SortingAlgo {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{5,4,3,2,1};
        selectionSort(arr);
        printArray(arr);
    }

    private static void bubbleSort(Integer[] arr){      // We can add a flag to prevent unwanted running of the loops
        boolean swap = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    swap = true;
                }
            }
            if(!swap){      //This achieves a time complexity of O(n)
                System.out.println("breaking the loop");
                break;
            }
        }
    }

    private static void selectionSort(Integer[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[min]){
                    min =  j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    private static void printArray(Integer[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }
}
