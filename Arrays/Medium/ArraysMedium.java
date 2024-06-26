package Arrays.Medium;

import java.util.*;

public class ArraysMedium {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,2,3,4,5};
        Integer[] ans = TwoSumOptimal(arr, 6);
        for (Integer integer : ans) {
            System.out.println(integer);
        }
    }

    private static void TwoSumBetter(Integer[] arr, int target){ //For other varient return elements
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int needed = target - num;
            if(map.containsKey(needed)){
                System.out.println("Yes");
                return;
            }
            map.put(arr[i], i);
        }
    }
    
    private static Integer[] TwoSumOptimal(Integer[] arr, int target){
        Arrays.sort(arr);
        Integer[] ans = new Integer[2];
       int left = 0;
       int right = arr.length-1;
       while(left < right){
        if(arr[left]+arr[right] == target){
            ans[0] = arr[left];
            ans[1] = arr[right];
            return ans;
        }
        if(left+right > target){
            right--;
        }
        if(left+right < target){
            left++;
        }
       }
       return null;
    }
}
