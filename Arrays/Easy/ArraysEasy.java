import java.util.HashSet;

public class ArraysEasy {
    public static void main(String args[]){
        Integer[] arr = new Integer[]{1,1,2,2,3,3};
        removeDuplicatesOptimal(arr);
    }

    private static void largestNumber(Integer[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    private static void secondLargest(Integer[] arr){
        int max = Integer.MIN_VALUE;
        int prev =  0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                prev = max;
                max = arr[i];
            }
        }
        System.out.println(prev);
    }

    private static void secondSmallest(Integer[] arr){
        int min = Integer.MAX_VALUE;
        int prev =  Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                prev = min;
                min = arr[i];
            } else if (arr[i] < prev && arr[i] != min) {
                prev = arr[i];
            }
        }
        System.out.println(prev);
    }

    private static void isSorted(Integer[] arr) {
        for (int i = 1; i < arr.length; i++) {
          if (arr[i] < arr[i - 1]){
            System.out.println("false");
            return;
          }
        }
    
        System.out.println("true");
    }

    private static void removeDuplicates(Integer[] arr){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int size = set.size();
        int j = 0;
        for (int x: set) {
            arr[j++] = x;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void removeDuplicatesOptimal(Integer[] arr){
        // for (int i = 0; i < arr.length; i++) {
        //     int i = 0;
        //     for (int j = 1; j < arr.length; j++) {
        //         if (arr[i] != arr[j]) {
        //             i++;
        //             arr[i] = arr[j];
        //         }
        //     }
        //     return i + 1;  REVIEWWW
    }


}
