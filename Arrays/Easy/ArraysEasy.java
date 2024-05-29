public class ArraysEasy {
    public static void main(String args[]){
        Integer[] arr = new Integer[]{1,2,3,4,5};
        secondSmallest(arr);
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
}
