import java.util.HashMap;

public class Hashing {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,2,2,5,5,10,10,10};
        countFrequenciesOptimal(arr);
    }

    private static void countFrequencies(Integer[] arr){
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(visited[i] != true){
                int count = 1;
                visited[i] = true;
                for (int j = i+1; j < arr.length; j++) {
                    if(visited[j] == true){
                        continue;
                    }
                    if(arr[i] == arr[j] && visited[j] == false){
                        count++;
                        visited[j] = true;
                    }

                }
                System.out.println(arr[i] + ":" + count);
            }
        }
    }

    private static void countFrequenciesOptimal(Integer[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                int ele = map.get(arr[i]);
                ele++;
                map.put(arr[i], ele);
            }else{
                map.put(arr[i], 1);
            }
        }
        for (Integer key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
