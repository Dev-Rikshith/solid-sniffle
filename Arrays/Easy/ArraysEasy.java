import java.util.*;

public class ArraysEasy {
    public static void main(String args[]){
        Integer[] arr = new Integer[]{1,0,1,1,0,1,1,1};
        countOnes(arr);
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

    private static void rotateArray(Integer[] arr){
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void rotateArrayTemp(Integer[] arr, int k, boolean flag){
        Integer[] temp = new Integer[arr.length];
        int count = arr.length-1;
        for (int i = 1; i <= k; i++) {
            temp[i] = arr[count--];
        }
        for(int i = arr.length; i >= 0; i--){
            arr[i] = arr[i-1];
        }
    }

    private static void rotateArrayOptimal(Integer[] arr, int k){
        reverseArray(arr, 0, k);
        reverseArray(arr, k+1, arr.length-1);
        reverseArray(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void reverseArray(Integer[] arr, int start, int end){
        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }

    private static void moveZeros(Integer[] arr){
        int i = 0, j = arr.length-1;
        while(i<j){
            if(arr[i]==0 && arr[j]!=0){
                swap(arr, i, j);
                i++;
                j--;
            }
            if(arr[i] != 0){
                i++;
            }
            if(arr[j] == 0){
                j--;
            }  
        }
        for (int j2 = 0; j2 < arr.length; j2++) {
            System.out.println(arr[j2]);
        }
    }

    private static void moveZerosOptimal(Integer[] arr){
       int counter = 0;
       for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[counter++] = arr[i];
            }
       }
       for(int j = counter; j < arr.length; j++){
        arr[counter++] = 0;
       }
       for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
       }
    }

    private static void swap(Integer[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void linearSearch(Integer[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                System.out.println(i+1);
            }
        }
    }

    private static void countOnes(Integer[] arr){
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                counter++;
                continue;
            }else{
                counter = 0;
            }
        }
        System.out.println(counter);
    }

    private static void findOneElement(Integer[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                int ele = map.get(arr[i]);
                ele++;
                map.put(arr[i], ele);
            }else{
                
            }
        }
    }
}
