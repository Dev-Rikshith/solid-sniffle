public class Recursion {
    public static void main(String[] args) {
       System.out.println(sumOfN(5));
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

    private static int sumOfN(int n){
        if(n==0){
            return 0;
        }
        return sumOfN(n-1);
    }
}
