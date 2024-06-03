public class Recursion {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    private static void nSomething(int n){
        if(n==0){
            return;
        }
        nSomething(n-1);
        System.out.println("Something");
       
    }

    private static void nName(int n){
        if(n==0){
            return;
        }
        nName(n-1);
        System.out.println("Ricky");
       
    }

    private static void nToOne(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        nToOne(n-1);
       
    }

    private static void oneToN(int n){
        if(n==0){
            return;
        }
        oneToN(n-1);
        System.out.println(n);
    }

    private static int sumOfN(int n){  //Also refer to the parameterized way of solving this problem
        if(n==0){
            return 0;
        }
        return n + sumOfN(n-1);
    }

    private static int fact(int n){  //Also refer to the parameterized way of solving this problem
        if(n==1){
            return 1;
        }
        return n * fact(n-1);
    }

    private static void reverseArray(Integer[] arr, int start, int end){
        if(start > end){
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start+1, end-1);
    }

    private static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
}
