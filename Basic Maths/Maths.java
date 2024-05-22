import java.util.*;


public class Maths {
    public static void main(String[] args) {
        printDivisorsOptimal(15);
    }

    private static void countDigits(int n){
        int counter = 0;
        while(n > 0){
            counter++;
            n = n/10;
        }
        System.out.println(counter);
    }

    private static void countOptimal(double n){
        int cnt = (int) (Math.log10(n) + 1);
        System.out.println(cnt);
    }

    private static void reverseNumber(int n){
        int number = 0;
        while(n>0){
            int digit = n%10;
            number =  number*10+digit;
            n=n/10;
        }
        System.out.println(number);
    }

    private static void palindrome(int n){
        int number = 0;
        int num = n;
        while(n>0){
            int digit = n%10;
            number =  number*10+digit;
            n=n/10;
        }
        if(num == number){
            System.out.println("true");
        }else{
            System.out.println("false");
        } 
    }

    private static void gcd(int a, int b){
        int gcd = 1;
        for(int i = 1; i <= Math.min(a, b); i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }

    private static void gcdOptimal(int a, int b){
        int gcd = 1;
        for(int i = Math.min(a, b); i > 0; i--){
            if(a%i==0 && b%i==0){
                gcd = i;
                break;
            }
        }
        System.out.println(gcd);
    }

    private static void euclidean(int a, int b){
        while (a > 0 && b > 0){
            if(a>b){
                a=a%b;
            }else{
                b=b%a;
            }

            if(a==0){
                System.out.println(b);
                return;
            }
            System.out.println(a);
            return;
        }
    }

    private static void armstrong(int a){
        int n = a;
        int sum = 0;
        int length = String.valueOf(a).length();
        while(n > 0){
            int digit = n%10;
            sum += Math.pow(digit, length);
            n = n/10;
        }
        if(sum == a){
            System.out.println("true");
            return;
        }
        System.out.println("false");
    }

    private static void printDivisors(int n){
        for (int i = 1; i < n; i++) {
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }

    private static void printDivisorsOptimal(int n){
        for (int i = 1; i < Math.sqrt(n); i++) {
            if(n%i==0){
                System.out.print(i+" ");
                System.out.print(n/i+" ");
            }
        }
    }

}
