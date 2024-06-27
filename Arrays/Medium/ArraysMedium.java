package Arrays.Medium;

import java.util.*;

public class ArraysMedium {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{4,4,2,4,3,4,4,3,2,4};
        majorityElement(arr);
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

    private static Integer[] sortColors(Integer[] arr){ //Also called as Sort 0's,1's,2's problem
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr, mid, low);
                mid++;
                low++;
            }
            if(arr[mid]==1){
                mid++;
            }
            if(arr[mid]==2){
                swap(arr, mid, high);
                high--;
            }
        }
        return arr;
    }

    private static void majorityElement(Integer[] arr){
        int element = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(count==0){
                count = 1;
                element = arr[i];
            }else if(arr[i]==element){
                count++;
            }else{
                count--;
            }
        }
        System.out.println(element);
    }

    private static void swap(Integer[] arr, int a, int b){
        Integer temp = arr[a];
        arr[a] =arr[b];
        arr[b] = temp;
    }
}
