public class Patterns{
    public static void main(String[] args) {
        tenth(3);
    }

    private static void first(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();     
        }
    }

    private static void second(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();     
        }
    }

    private static void third(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();     
        }
    }

    private static void fourth(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();     
        }
    }

    private static void fifth(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print("* ");
            }
            System.out.println();     
        }
    }

    private static void sixth(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(j+" ");
            }
            System.out.println();     
        }
    }

    private static void seventh(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            } 
            System.out.println();
        }
    }

    private static void eighth(int n){
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            } 
            System.out.println();
        }
    }

    private static void ninth(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            } 
            System.out.println();
        }
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            } 
            System.out.println();
        }
    }

    private static void tenth(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();     
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print("* ");
            }
            System.out.println();     
        }
    }
}